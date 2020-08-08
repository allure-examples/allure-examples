#! /usr/bin/env bash

cd /github/workspace
#echo "listing files in workspace ..."
#ls -l

#echo "generating report ..."
#RESULTS_DIRECTORY=$1
#REPORT_DIRECTORY=$2
#ALLURE_VERSION=$3
#RESULTS_HISTORY=$RESULTS_DIRECTORY/history
#REPORT_HISTORY=$REPORT_DIRECTORY/history

#if [ ! -d "$REPORT_DIRECTORY" ]; then
#  mkdir $REPORT_DIRECTORY
#fi

#if [ -d "$RESULTS_HISTORY" ]; then
#  echo "copying $RESULTS_HISTORY to $REPORT_HISTORY ..."
#  cp -r $RESULTS_HISTORY $REPORT_HISTORY
#fi

unset JAVA_HOME
echo "generating report ..."
allure generate --clean $1 -o $2
echo "listing report directory ..."
ls -l $2