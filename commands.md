docker build . -t app
docker run -p 8080:8080 app
docker tag app <docker-id>/app    Ex docker tag app prathu1993/app 
docker push <docker-id>/app       Ex docker push prathu1993/app
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
kubectl get all
minikube service app --url


Ref : https://bell-sw.com/blog/how-to-deploy-spring-boot-application-on-kubernetes/