# Problema del Productor Consumidor usando Monitores
## Monitores: Concepto

Los semáforos proporcionan una herramienta primitiva pero poderosa y flexible para hacer cumplir la
exclusión mutua y para coordinar procesos. La dificultad es que las operaciones semWait y semSignal
pueden estar dispersas a lo largo de un programa y no es fácil ver el efecto general de estas
operaciones en los semáforos que afectan.

El monitor es una construcción de lenguaje de programación que proporciona una funcionalidad
equivalente a la de los semáforos y que es más fácil de controlar. La construcción del monitor se ha
implementado en varios lenguajes de programación, incluyendo Pascal Concurrente, Pascal-Plus,
Modula-2, Modula-3 y Java. También se ha implementado como una biblioteca de programas.

Esto permite a los programadores poner un bloqueo de monitor en cualquier objeto.
Un monitor es un módulo de software que consiste en uno o más procedimientos, una secuencia de
inicialización y datos locales. Las principales características de un monitor son las siguientes:

1. Las variables de datos locales sólo son accesibles por los procedimientos del monitor y no por
ningún procedimiento externo.

2. Un proceso entra en el monitor invocando uno de sus procedimientos.

3. Sólo puede estar ejecutándose un proceso en el monitor a la vez; Cualquier otro proceso que haya
invocado el monitor está bloqueado, esperando a que el monitor esté disponible.
Un monitor admite la sincronización mediante el uso de variables de condición que están contenidas
dentro del monitor y accesibles sólo dentro del monitor. Las variables de condición son un tipo de datos
especial en monitores, que funcionan con dos funciones:
  * cwait (c): Suspender la ejecución del proceso de llamada bajo la condición c. El monitor ya está disponible para su uso por otro proceso.
  * csignal (c): Reanudar la ejecución de algún proceso bloqueado después de un cwait en la misma condición. 
  Si hay varios procesos de este tipo, elija uno de ellos; Si no hay tal proceso, no se debe de hacer nada.

Debemos de tener en cuenta que las operaciones de espera y señal del monitor son diferentes de las del
semáforo. Si un proceso en un monitor señaliza y ninguna tarea está esperando en la variable de
condición, la señal se pierde.
