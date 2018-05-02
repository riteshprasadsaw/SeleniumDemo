#!groovy
node {
    stage('Git checkout') { // for display purposes
        git 'https://github.com/ryanisenia/selenium_automation_pipeline.git'
    }
    stage('Smoke') {
        try {
            sh "mvn clean verify"
        } catch (err) {

        } finally {
            publishHTML (target: [
                    reportDir: 'ExtentReports',
                    reportFiles: 'ExtentReportResults.html',
                    reportName: "Smoke tests report"
            ])
        }
    }

}