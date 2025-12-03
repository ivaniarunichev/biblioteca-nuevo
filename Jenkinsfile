pipeline {
    agent any

    tools {
        jdk 'jdk-17'
        maven 'Maven3.9.11'
    }

    stages {
        stage('Show messages'){
            steps {
                echo 'Primer stage del pipeline'
                echo 'A continuacion hacemos checkout del proyecto'
            }
        }

        stage('Checkout proyecto'){
            steps {
                git branch: 'main',
                    url: 'https://github.com/ivaniarunichev/biblioteca-nuevo.git'
                }
        }

        stage('Maven clean'){
            steps{
                script {
                    // Obtener la ruta de Maven configurada en Jenkins
                    def mvnHome = tool 'Maven3.9.11'
                    // Ejecutar Maven con la ruta completa
                    bat "\"${mvnHome}\\bin\\mvn\" clean"
                }
            }
        }
    }
}
