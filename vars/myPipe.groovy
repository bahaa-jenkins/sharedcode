def call( Map settings = [:] ) {
    node('master'){
           stage('build') { steps { sh 'echo Building ${BRANCH_NAME}...' }
     }
    }
}
