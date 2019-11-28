pipeline {
    agent any
	tools {
        maven 'M3' 
		// Get the Maven tool.
				// ** NOTE: This 'M3' Maven tool must be configured
				// **  in the global configuration. 
    }
    stages {
	
		stage('SourcePreparation') {
			steps {	
				// Get some code from a GitHub repository
				git 'https://github.com/sanogotech/ereservation.git'
			}
		}
		
        stage('Build') {
            steps {
                echo 'Hello, Build Maven'
				bat'mvn clean compile'
            }
        }
        stage('Test') { 
            steps {
                echo 'Hello, Test '
				bat 'mvn  clean -DexcludedGroups=integration   test'
				junit '/target/surefire-reports/*.xml'
			}

        }
		
		
		stage('Package') { 
            steps {
                echo 'Hello, Package'
				bat 'mvn clean -DexcludedGroups=integration  package'
				//bat 'mvn -B -DskipTests clean package'
            }
        }
    }
	
	
	post {
        always {
           archive "target/**/*"
   
        }
        success {
            mail to:"me@example.com", subject:"SUCCESS: ${currentBuild.fullDisplayName}", body: "Yay, we passed."
        }
        failure {
            mail to:"me@example.com", subject:"FAILURE: ${currentBuild.fullDisplayName}", body: "Boo, we failed."
        }
        unstable {
            mail to:"me@example.com", subject:"UNSTABLE: ${currentBuild.fullDisplayName}", body: "Huh, we're unstable."
        }
        changed {
            mail to:"me@example.com", subject:"CHANGED: ${currentBuild.fullDisplayName}", body: "Wow, our status changed!"
        }
    }
}