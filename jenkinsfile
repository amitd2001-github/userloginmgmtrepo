pipeline{
    agent any
    stages {
        stage ('Compile Stage')
            steps{
                    withMaven(maven : 'G:\CorporateTrainings\Softra\Softra\Softwares\apache-maven-3.3.3\bin'){
                        sh 'mvn clean compile'
                    }
            }    
        }

        stage ('Testing Stage')
            steps{
                    withMaven(maven : 'G:\CorporateTrainings\Softra\Softra\Softwares\apache-maven-3.3.3\bin'){
                        sh 'mvn test'
                    }
            }    
        }

        stage ('Deployment Stage')
            steps{
                    withMaven(maven : 'G:\CorporateTrainings\Softra\Softra\Softwares\apache-maven-3.3.3\bin'){
                        sh 'mvn deploy'
                    }
            }    
        }
    }
}