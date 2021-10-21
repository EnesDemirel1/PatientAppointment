Instructions

1- Create a secret key in Jenkins named "Github_Credentials"
2- Add the ssh private key into this secret key that you created at 1st step. (private key can be found in clone.key file)
3- Create a new Jenkins pipeline job.
4- Add "Jenkinsfile-deploy" as a script to this new job.
5- Make sure you have Java 11 and Maven installed to the jenkins master node.
6- Run the build!