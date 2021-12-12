pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                
                echo 'Hello World'
            }
            steps {script{
                def String text = "julia ma live"
                print text
                text = 5
                print text
            }}
        }
    }
