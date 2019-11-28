# ereservation

## Test  INTEGRATION 

  ### TestClassIT / *IT.java  pour les tests d'intégration non visible par mvn clean test
  
  ###  Depuis JUNIT5  @Tag pour faire un filtre sur groupes des tests
  
  
   ** mvn clean -DexcludedGroups="integration"  test
  
  ** mvn clean -Dgroups="integration,slow"  test
  
  
  
## Documentation
https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
https://www.mkyong.com/junit5/junit-5-tagging-and-filtering-tag-examples/

https://www.baeldung.com/maven-goals-phases