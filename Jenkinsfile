pipeline {
    agent any
    stages {
	
		stage('SourcePreparation') {
			steps {	
				// Get some code from a GitHub repository
				git 'https://github.com/sanogotech/ereservation.git'
				
				// Get the Maven tool.
				// ** NOTE: This 'M3' Maven tool must be configured
				// **  in the global configuration.  
			}
		}
		
        stage('Build') {
            steps {
                echo 'Hello, Build Maven'
                sh 'mvn --version'
				sh 'mvn compile'
            }
        }
        stage('Test') { 
            steps {
                echo 'Hello, Test '
                sh 'java -version'
				sh 'mvn test'
            }
        }
		
		
		 stage('Package') { 
            steps {
                echo 'Hello, Package'
                sh 'java -version'
				sh 'mvn package'
            }
        }
    }
}