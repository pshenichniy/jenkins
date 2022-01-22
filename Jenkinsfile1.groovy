pipeline {
    agent any
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    stages {
        stage('Example') {
            steps {
                echo "${params.Greeting} World!"
            }
        }
        stage('Install OpenVino') {
            steps {
                echo 'Install open Vino'
            }
        }
        stage('Сборка') {
            steps {
                echo 'Выполняем команды для сборки'
            }
        }

        stage('Тестирование') {
            steps {
                echo 'Тестируем нашу сборку'
            }
        }
        stage('Развертывание') {
            steps {
                echo 'Переносим код в рабочую среду или создаем артефакт'


            }
        }

    }
}
class Windows {
    static final Map SUPPORTED_DEVICES = [
            'ADL': [deviceType: 'PUX',label: 'adl']
    ]
    static void  runWindows10(script) {
        def params = script.params
        def host  = ''
        def deviceProps = SUPPORTED_DEVICES[params.target_device]
        def jobTimeout = params.job_timeout.toInteger() * 60
        def labels = params.specific_lables ? "Windows10 && ${deviceProps.label} && ${params.specific_lables}" : "windows10 && ${deviceProps.label}"
        script.job_simple url: labels, maxtime: jobTimeout, body: {
            try {
                host = script.env.NODE_NAME
            script.stage('Checkout')
                    {
                        println("test checout")
                    }
            }
            finally {
                script.stage('Reboot node') {
                    println('make reboot node')
                }
            }
        }

    }
}
