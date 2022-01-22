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