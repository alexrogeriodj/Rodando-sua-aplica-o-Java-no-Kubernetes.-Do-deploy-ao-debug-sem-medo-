# Java no Kubernetes



### Requerimentos:

**Java 14**

Ajuda para instalar ferramentas:

https://github.com/alexrogeriodj/Rodando-sua-aplica-o-Java-no-Kubernetes.-Do-deploy-ao-debug-sem-medo-

### Crie e execute o aplicativo:

Spring boot e banco de dados mysql em execução no docker

**Clone o repositório**

```bash
git clone https://github.com/alexrogeriodj/Rodando-sua-aplica-o-Java-no-Kubernetes.-Do-deploy-ao-debug-sem-medo-.git
```

**Crie um aplicativo**

```bash
cd java-kubernetes
mvn clean install
```

**Inicie o Banco de Dados**

```bash
make run-db
```

**Execute**

```bash
java --enable-preview -jar target/java-kubernetes.jar
```

**Acesse**

http://localhost:8080/app/users

http://localhost:8080/app/hello


## Referências

https://kubernetes.io/docs/home/

https://minikube.sigs.k8s.io/docs/
