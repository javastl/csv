# csv
Sample to show pod name and threads availble

Download respository 

Java version 11

 

kubectl should be valid for v1.21
Run prior to jkube build 
  kubectl create  namespace csv 
  
run
./mvnw package k8s:build  k8s:resource k8s:apply k8s:deploy 

To remove deployment 
kubectl delete namespace csv 
