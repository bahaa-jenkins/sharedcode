
def call(Map settings = [:]) {


//    pipeline {
    agent any
    stages {
            stage('build') {
                            steps {
                                  sh 'echo Building ${BRANCH_NAME}...'
                                  }
                           }
           }
 // }

}
