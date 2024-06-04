
Xavier Valle Dorantes

Introducción 

Las estructuras de datos son fundamentales en la informática para organizar y manipular información de manera eficiente. Entre las más comunes se encuentran las pilas, listas y colas. Las pilas son estructuras de datos lineales que siguen el principio de LIFO (Last In, First Out), lo que significa que el último elemento insertado es el primero en ser eliminado. Esto las hace ideales para tareas como la reversión de cadenas o la implementación de sistemas de historial en aplicaciones. 
Por otro lado, las listas son estructuras de datos que pueden ser tanto lineales como no lineales, y permiten el almacenamiento de elementos de manera secuencial. Las listas enlazadas, por ejemplo, conectan nodos que contienen datos y una referencia al siguiente nodo. Esto las hace flexibles para la inserción y eliminación de elementos en cualquier punto, aunque el acceso secuencial es más eficiente que el acceso aleatorio. Por último, las colas son estructuras de datos similares a las pilas, pero siguen el principio FIFO (First In, First Out), lo que significa que el primer elemento en ser insertado es el primero en ser eliminado. Este comportamiento las hace útiles en situaciones como la gestión de procesos en sistemas operativos o la implementación de buffers en la comunicación de datos. 

Investigación:


Pilas 


La pila es un contenedor de nodos y tiene dos operaciones básicas: push (o apilar) y pop (o desapilar). «Push» añade un nodo a la parte superior de la pila, dejando por debajo el resto de los nodos ya presentes en la pila. «Pop» devuelve y elimina el actual nodo superior de la pila. Una metáfora que se utiliza con frecuencia es la idea de una pila de platos dispuesta en una cafetería en un contenedor con un muelle que mantiene la pila a nivel. En esa serie, solo el primer plato es visible y accesible para el usuario, todos los demás permanecen ocultos. Como se añaden nuevos platos, cada nuevo plato se convierte en la parte superior de la pila, permaneciendo escondidos debajo los demás. 
Operaciones 
Habitualmente, junto a las dos operaciones básicas de apilar y desapilar (push, pop), las pilas puede implementar otra serie de funciones: 

● Crear (constructor): crea la pila vacía. 

● Tamaño (size): regresa el número de elementos de la pila. 

● Apilar (push): añade un elemento a la pila. 

● Desapilar (pop): lee y retira el elemento superior de la pila. 

● Leer último (top o peek): lee el elemento superior de la pila sin retirarlo. ● Vacía (empty): devuelve cierto si la pila está sin elementos o falso en caso de que contenga alguno 

![download](https://github.com/xAvAd0/PilasColasListas/assets/161792284/4fc55ac7-3f6f-4386-bb7c-2c612fa4a017)


Listas 


Una lista o secuencia es un tipo de dato abstracto que representa una secuencia ordenada de valores, donde el mismo valor puede ocurrir más de una vez. Un caso de una lista es una representación computacional del concepto matemático de una secuencia finita. Las listas son un ejemplo básico de contenedores, cuando contienen otros valores. Si el mismo valor se repite varias veces, cada ocurrencia está considerada un elemento distinto. 
Operaciones 
La implementación de la estructura de dato de lista puede conllevar a algunas de las operaciones siguientes: 

● Un constructor para crear una lista vacía; 

● Una operación para probar si una lista está vacía; 

● Una operación para agregar una entidad al inicio de una lista ● Una operación para agregar una entidad al final de una lista 

● Una operación para determinar el primer elemento (o la "cabeza") de una lista 

● Una operación para referirse a la lista que consta de todos los componentes de una lista excepto su primero (esto es llamado "cola" de la lista.) 

![insercion](https://github.com/xAvAd0/PilasColasListas/assets/161792284/0f0eace7-a435-42aa-9cef-38b3d29505fd)


Colas 


Una cola es un tipo de dato abstracto, caracterizada por ser una secuencia de elementos en la que la operación de inserción push se realiza por un extremo y la operación de extracción pull por el otro. También se le llama estructura FIFO (del inglés First In First Out), debido a que el primer elemento en entrar será también el primero en salir. 
Las colas se utilizan en sistemas informáticos, transportes y operaciones de investigación (entre otros), donde los objetos, personas o eventos son tomados como datos que se almacenan y se guardan mediante colas para su posterior procesamiento. 
Operaciones 
Algunas de sus operaciones básicas son: 

● Crear: se crea la cola vacía. 

● Encolar: se añade un elemento a la cola. Se añade al final de esta. ● Desencolar: (sacar, salir, eliminar): se elimina el elemento frontal de la cola, es decir, el primer elemento que entró. 

● Frente: (consultar, front): se devuelve el elemento frontal de la cola, es decir, el primer elemento que entró. 

![download](https://github.com/xAvAd0/PilasColasListas/assets/161792284/f9df6d0c-fce3-4091-ba61-2eef8467767c)



Conclusión
Además de su utilidad individual, estas estructuras de datos pueden combinarse y complementarse para resolver problemas más complejos. Por ejemplo, una lista doblemente enlazada puede utilizarse como base para implementar tanto pilas como colas, aprovechando las características de acceso rápido tanto al principio como al final de la lista. Esta capacidad de composición y abstracción es fundamental en el diseño de sistemas escalables y mantenibles, permitiendo a los desarrolladores crear soluciones adaptables a medida que los requisitos evolucionan. 
