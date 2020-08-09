#! /usr/bin/env bash

unset JAVA_HOME

mkdir -p ${INPUT_ALLURE_HISTORY}
echo "GITHUB_PAGES_URL ${INPUT_GITHUB_PAGES_URL}"
echo "github build number ${{ github.run_number }}"
echo "version ${INPUT_ALLURE_VERSION}"


echo "generating report from ${INPUT_ALLURE_RESULTS} to ${INPUT_ALLURE_REPORT} ..."
#ls -l ${INPUT_ALLURE_RESULTS}
allure generate --clean ${INPUT_ALLURE_RESULTS} -o ${INPUT_ALLURE_REPORT}
echo "listing report directory ..."
ls -l ${INPUT_ALLURE_REPORT}