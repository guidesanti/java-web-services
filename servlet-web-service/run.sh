#!/bin/sh

echo
echo "============================================================================================="
echo "Running ..."
echo "============================================================================================="
echo
DOCKER_IMAGE_NAME="servlet-web-service"
DOCKER_IMAGE_VERSION="1.0.0"
DOCKER_CONTAINER_NAME="servlet-web-service"
docker run --detach -p 8080:8080 --name ${DOCKER_CONTAINER_NAME} ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION}
sleep 1