def call(int build_number){
    if (build_number%2 == 0){
        pipeline{
            agents any 
            stages{
                stage('Even'){
                    echo 'Build number is even'
                    script{
                        log.info 'Starting even build'
                        log.warning 'Nothing to do'
                    }
                }
            }
        }
    }
    else {
        pipeline {
            agents any
            stages {
                stage ('Odd') {
                    echo 'Build number is odd'
                    script {
                        log.info 'Starting odd build'
                        log.warning 'Nothing to do'
                    }
                }
            }
        }
    }
}