pipeline {
    agent any

    stages {
        stage('stage1') {
            steps {script{
                def String text = "julia ma live"
                print text
                text = 5
                print text
                
                echo 'Hello World'
            }}
        }
        stage('stage2') {
            steps {script{
                def username = 'Jenkins'
                echo 'Hello Mr. ${username}'
                echo "I said, Hello Mr. ${username}"
                def String text = "julia ma live"
                print text
                text = 5
                print text
                
                echo 'Hello World'
            
            }}
        }
    }
}
