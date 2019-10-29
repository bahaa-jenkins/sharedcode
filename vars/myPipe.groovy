def call( Map settings = [:] ) {
    node('master'){
    stages {
           stage('build') { steps { sh 'echo Building ${BRANCH_NAME}...' }
     }
    }
}
}
