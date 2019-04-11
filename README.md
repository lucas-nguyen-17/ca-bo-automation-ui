# UI automation test

This is UI automation test script using Serenity BDD framework with screenplay pattern.

## Installation

- Require Java (1.8 or higher)
- Require Maven (3.5.0 or higher)

## Usage
**Run Full_test**

    cd rga-ca-bo-ui/test/ca-bo-automation-ui
    
    mvn clean verify -Pfull-test
    
**Run Full_test_parallel**

    cd rga-ca-bo-ui/test/ca-bo-automation-ui
    
    mvn clean test -Pfull-test-parallel

## Report

Open file **index.html** in folder

``rga-ca-bo-ui/test/ca-bo-automation-ui/target/site/serenity``