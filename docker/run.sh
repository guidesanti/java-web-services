#!/usr/bin/env bash

echo
echo "============================================================================================="
echo "Running ..."
echo "============================================================================================="
echo
#DOCKER_IMAGE_NAME="java-web-services"
#DOCKER_IMAGE_VERSION="latest"
#DOCKER_CONTAINER_NAME="java-web-services"
#docker run --detach -p 8080:8080 --name ${DOCKER_CONTAINER_NAME} ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_VERSION}
docker-compose -f docker-compose.yml up
sleep 1