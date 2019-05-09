#!/bin/sh

# Building the project
echo
echo "============================================================================================="
echo "Building the project ..."
echo "============================================================================================="
echo
mvn clean install
sleep 1

# Remove old Docker images
echo
echo "============================================================================================="
echo "Removing old Docker images ..."
echo "============================================================================================="
echo
DOCKER_IMAGE_NAME="servlet-web-service"
OLD_IMAGES=`docker image ls -q ${DOCKER_IMAGE_NAME}`
for DOCKER_IMAGE_ID in ${OLD_IMAGES}; do
    echo "Removing image ${DOCKER_IMAGE_ID}"
    docker image rm ${DOCKER_IMAGE_ID}
done
OLD_IMAGES=`docker image ls -f "dangling=true" -q`
for DOCKER_IMAGE_ID in ${OLD_IMAGES}; do
    echo "Removing image ${DOCKER_IMAGE_ID}"
    docker image rm ${DOCKER_IMAGE_ID}
done
sleep 1

# Build the new Docker image
echo
echo "============================================================================================="
echo "Building the new Docker image ..."
echo "============================================================================================="
echo
docker build -t servlet-web-service:1.0.0 .
sleep 1

exit 0