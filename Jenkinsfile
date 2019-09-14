pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Palanatolich153/TrelloAPI.git'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Report') {
            steps {
                step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
            }
        }
    }
}