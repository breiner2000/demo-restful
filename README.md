# demo-restful 

### Construir imagen 

```shell
docker build -t spring/demo . 
```


### Correr imagen
cambiar puerto contenedor dependiendo del perfil
`SPRING_PROFILES_ACTIVE=docker`: 8888
`SPRING_PROFILES_ACTIVE=dev`: 9000

```shell
docker run -p 8080:8888 -e SPRING_PROFILES_ACTIVE=docker spring/demo
```

> Nota:Cambios en LoadDatabase y puerto dependen del perfil
