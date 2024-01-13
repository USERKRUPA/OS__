#use openjdk image
FROM openjdk:latest
#set working directory
WORKDIR /dir
#copy current directory data to container's working directory
COPY . /dir
#compile command
RUN javac PrimeNo.java
#execute class file
CMD ["java","PrimeNo"]