#! /usr/bin/env bash

unset JAVA_HOME

mkdir -p ${INPUT_GH_PAGES}
mkdir -p ${INPUT_ALLURE_HISTORY}
cp -r $(pwd)/${INPUT_GH_PAGES}/. $(pwd)/${INPUT_ALLURE_HISTORY}
REPOSITORY_OWNER_SLASH_NAME=${INPUT_GITHUB_REPO}
REPOSITORY_NAME=${REPOSITORY_OWNER_SLASH_NAME##*/}
GITHUB_PAGES_WEBSITE_URL="https://${INPUT_GITHUB_REPO_OWNER}.github.io/${REPOSITORY_NAME}"
echo "Github pages url $GITHUB_PAGES_WEBSITE_URL"

#echo "version ${INPUT_ALLURE_VERSION}"


echo "generating report from ${INPUT_ALLURE_RESULTS} to ${INPUT_ALLURE_REPORT} ..."
#ls -l ${INPUT_ALLURE_RESULTS}
allure generate --clean ${INPUT_ALLURE_RESULTS} -o ${INPUT_ALLURE_REPORT}
echo "listing report directory ..."
ls -l ${INPUT_ALLURE_REPORT}