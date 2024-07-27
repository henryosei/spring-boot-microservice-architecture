#!/bin/bash

modules=("api-gateway" "config-server","customer-microservice","deposit-microservice") # Add all your modules here

for module in "${modules[@]}"; do
  mvn -pl $module spring-boot:run &
done

wait
