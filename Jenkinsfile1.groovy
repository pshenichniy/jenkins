pipeline {
    agent any
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    stage('someStage') {
        steps {
            script {
                try {
                    build job: 'system-check-flow'
                } catch (err) {
                    echo err
                }
            }
            echo currentBuild.result
        }
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
                    run(cmd,'python --version')
                }
            }
            stage('Сборка') {
                steps {
                    echo 'make bild'
                }
            }

            stage('Testing') {
                steps {
                    echo 'testing as bild'
                }
            }
            stage('developing adn starting') {
                steps {
                    echo 'make artrfacts'


                }
            }

        }
    }
//    finally {
//        script.stage('Reboot node') {
//            println('make reboot node')
//        }
//    }

//    class Windows {
//        static final Map SUPPORTED_DEVICES = [
//                'ADL': [deviceType: 'PUX', label: 'adl']
//        ]
//
//        static void runWindows10(script) {
//            def params = script.params
//            def host = ''
//            def deviceProps = SUPPORTED_DEVICES[params.target_device]
//            def jobTimeout = params.job_timeout.toInteger() * 60
//            def labels = params.specific_lables ? "Windows10 && ${deviceProps.label} && ${params.specific_lables}" : "windows10 && ${deviceProps.label}"
//            script.job_simple url: labels, maxtime: jobTimeout, body: {
//                try {
//                    host = script.env.NODE_NAME
//                    script.stage('Checkout')
//                            {
//                                println("test checout")
//                            }
//                }
//                finally {
//
//                }
//            }
//
//        }
//    }
