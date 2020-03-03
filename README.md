# Treinamento Stefanini

Repositório do participante do treinamento Rodolfo Ferreira

## Desafio para a aula 2

Mapear as entidades restantes contidadas no arquivo 

./src/main/resources/db.sql

Alterar o método que retorna umas lista para receber filtros como parâmetro 

~~~java
public Optional<List<T>> getList() {
    CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
    CriteriaQuery<T> query = builder.createQuery(classe);
    query.from(classe);
    return Optional.of(getEntityManager().createQuery(query).getResultList());
}
~~~
 
