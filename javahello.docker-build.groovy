node {
    stage 'build'
        docker.image('maven').inside {
                stage 'Git clone'
                            git branch: 'master', credentialsId: 'githubSetevoy', url: 'https://github.com/polvmua/tests'
                                    stage 'Maven build'
                                                sh 'mvn clean package -f javahello/pom.xml'
                                                    }
                                                    }
                                                    