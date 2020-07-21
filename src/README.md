# Solución

Un monitor es una clase utilizada en el contexto de la concurrencia. Las instancias de la clase serán
objetos utilizados simultáneamente por varios procesos.

La definición de un monitor se realiza definiendo la clase correspondiente. Usaremos una sintaxis
inspirada en Java.

Una primera regla de sincronización impuesta en el contexto de los monitores es, pues, la siguiente:
Los métodos de un monitor se ejecutan en exclusión mutua.

_Nota en java_:
En Java, la exclusión mutua de métodos tiene que ser especificada explícitamente con la palabra clave
synchronized.
