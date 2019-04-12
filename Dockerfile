# Use the latest image from UBUNTU installed in the machine
FROM maven:3.6.0-jdk-8

MAINTAINER corefinder@docker.com

# Install git on ubuntu-selenium image
RUN apt-get install -y git

# Get the repository onto the local system
RUN git clone https://github.com/giang-nguyen-niteco/ca-bo-automation-ui.git

# Run the maven command to execute all the tests
WORKDIR "/ca-bo-automation-ui"
RUN mvn clean verify

ENTRYPOINT ["/bin/bash"]
