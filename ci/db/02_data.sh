#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" "$POSTGRES_DB" <<-EOSQL
  --Authors
  INSERT INTO AUTHORS (id, username, name) values (1, 'wise_turtle','La Tortuga Sabia') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (2, 'adolf_69','Adolf Hitler') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (3, 'matusalen','Matusalén') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (4, 'john_lenon','Juan Lima') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (5, 'albert_einstein','Albert Einstein') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (6, 'tu_madre','Tu madre') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (7, 'dexter','Dexter') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (8, 'paulo_cornelio','Paulo Cornélio') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (9, 'paulo_coelho','Paulo Coelho') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (10, 'buda','Buda') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (11, 'mahatma_gandhi','Mahatma Gandhi') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (12, 'mao_zedong','Mao Zedong') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (13, 'el_yonqui_vanidoso','El Yonqui Vanidoso') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (14, 'paqui','Paqui') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (15, 'el_rey_arturo','El Rey Arturo') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (16, 'juan_car','Juan Carlos I, Rey de España') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (17, 'pío_xii','Pío XII') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (18, 'dr_gregory_house','Dr Gregory House') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (19, 'el_rabino','El Rabino Salomón') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (20, 'hodor','Hodor') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (21, 'mi_madre','Mi madre') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (22, 'inygo_montoya','Iñigo Montoya') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (23, 'ramona','Ramona, el día de su divorcio') ON CONFLICT DO NOTHING;
  INSERT INTO AUTHORS (id, username, name) values (24, 'confucio','Confucio') ON CONFLICT DO NOTHING;

  --Advices
  INSERT INTO ADVICES (USERID, sentence) values (1, 'Si mi primer consejo quieres, pagar la cuota debes') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (2, 'Observa el horizonte pequeño aprendiz... no dejes de mirar al horizonte mientras te hago un hijo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (3, 'A falta de pan, buenas son tortas. En tu cara.') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (4, 'Hay muchas cosas en el mundo que no sabes, prueba a plantar un arbol en el ano de Rajoy, muchas cosas buenas ocurrirán pues el sol se pone después de cada retardecer') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (5, 'Hay muchas cosas en el mundo que no sabes, prueba a plantar un arbol en el ano de Rajoy, muchas cosas buenas ocurrirán pues el sol se pone después de cada retardecer') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (6, 'Elige las fresas como si de tu avuela se tratase, no te digo que será fácil te digo que no te debo pasta, cuidado con la luna llena pues en la vida hay cosas más importantes que trabajar') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (7, '¿Un consejo?, yo que se ti@, no te rayes y sal a tomar unas chupitos de mandarina') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (8, '¿Un consejo?, yo que se ti@, no te rayes y sal a tomar unas chupitos de mandarina') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (9, 'A mi me gustan los penes como las mandarinas: naranjas, bien puedes ir por la selva a las 12 de la noche sin protección porque total, vas a morir igual') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (10,'Si eres infiel a tu pareja no pasa nada, plantante delante suyo con mucha autoridad y di: Cariño, te he puesto los cuernos por lo menos con 12 personas pero ninguna me dan tan buen sexo como tu') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (11,'Si la vida te calabazas, hazte un zumo, pero ya te digo yo que el zumo de calabazas es un puta mierda') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (12,'Algunos dicen que la felicidad esta en la sonrisa de un niño, otros que está en la satisfacción del trabajo bien hecho, pero los más sabios saben que la felicidad esta en la pizza') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (13,'No te digo que será fácil, te digo que valdrá la pena Al igual que una serpiente repta durante un kilometro para morir aplastada bajo las ruedas de un altomóvil, tu triunfarás en la vida') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (14,'Las historias están bien si te las cuenta tu abuela jubilado, pero tu dejate de historias y ponte a trabajar, ¡vago de mierda!') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (15,'El mundo animal ha sufrido durante mucho tiempo el yugo opresor de la raza humana, ya va siendo hora de que nos esclavicen y nos metan en granjas de producción en espacios muy reducidos, donde succionen nuestros fluidos corporales mientras nos ceban a piensos cargados de hormonas Sería una justicia muy poética el porvenir') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (16,'¡Eh, devuelvame mi paraguas joven gmaberro!') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (17,'Imagine there''s no heaven It''s easy if you try No hell below us Above us only sky Imagine all the people Living for todaaaaaaaaaaaay AHAAAAAAAAAAAAA-AAAAAHHHHHHHHHHHHHHHH') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (18,'Dejad de poner frases en internet y decir que las he escrito yo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (19,'Y los niños? Es que nadie piensa en los niños?!') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (20,'¡No hombre no!, Esos cadáveres no son de su familia, yo no soy un asesino Con su permiso, me voy retirando con viento fresco Besis') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (21,'Qué es la vida, sino un breve lapsus en el tiempo, tremendamente improbable y tremendamente efímero? No te sorprendas con grandes cosas y asombrate por las cosas pequeñas, pues mientras más vives, menos sentido tendrá tu existencia (de mierda)') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (22,'Hay un oso invernal comiendo hojas de bambú que te va a matar plácidamente') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (23,'En casi todas las actividades de la vida y el placer se acaba uno manchando, y lo sabes') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (24,'Se me ha acabado el papel del culo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (1, 'Si deseas algo con todas tus fuerzas, el universo conspira para que lo consigas Bueno, no siempre, pero a veces sí Aunque la mayoría de las veces no No sé, me voy a masturbar y luego lo medito') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (2, 'Si pagas con cacahuetes, tendrás monos que escribirán libros por ti') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (3, 'Yo tengo un moco, lo miro con deseo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (4, 'Siento que estás bien, siento que estás agusto, siento tu cuerpo, siento tu mente, siento cincuenta, siticientos veinte') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (5, 'Vendo Opel Corsa') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (6, 'Digan lo que digan, los pelos del culo abrigan') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (7, 'Ke os flipais muxo los unibersitarios ai con vuestros estudios pero luego te meto un navajazo y no ai titulo ke te salve jajajajjj') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (8, 'Todos los problemas de la vida sirven para enerñarnos algo, inclusive aquellos que no solucionamos Salvo los errores aleatorios de Eclipse, esos no valen para una puta mierda') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (9, 'Gallina vieja hace buen caldo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (10,'Siempre sé tú mismo Pero si puedes ser Batman, mejor sé Batman, que cualquier cosa es ser mejor que tú') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (11,'La droga está conceptuada, socialmente, muy mal Pero la droga es pues ¿Qué te voy a decir yo? Es la auténtica salud El bienestar La alegría') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (12,'Cuando los días resultan iguales es porque el hombre ha dejado de percibir las cosas buenas vendo Opel Corsa en buen estado duerme en garaje que surgen de su vida cada vez que el sol cruza el cielo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (13,'Meterte en una hipoteca a 40 años es como decidir un caluroso día de verano que vas a pasar el resto de tu vida en manga corta') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (14,'Si los tontos volasen, a ti te iban a dar de comer en helicóptero') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (15,'Antes la muerte que perder la vida') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (16,'NO trates con prioridad a quien te trate como una opción Mátalo Solucionado') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (17,'Valora lo que tienes pues algún dia se irá Pero bueno, si son hemorroides mejor que se vayan ¿no?') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (18,'hij@, te voy a decir dos palabras que te van a abrir muchas puertas en la vida Empujar y Tirar') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (19,'El honor es lo que usan los dislexicos para calentar pizzas') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (20,'En mi hambre mando yo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (21,'Lo que comas, cagarás') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (22,'Si te matas con un coche te has muerto, pero si te matas con una moto te matas de verdad') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (23,'Soy una persona corriente y normal pero joder! Entre tanto anormal parece que soy alguien') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (24,'Lo siento mucho, me he equivocado y no volverá a ocurrir') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (1, 'My body is ready for you, baby') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (2, 'Quien caga duro y mea fuerte  no tiene miedo a la muerte') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (3, 'Teneis permiso para hacer lo que queráis, eso sí, que no os vean') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (4, 'Si quiere cambiar su vida haga algo, no crea en sus propias justificaciones; no se enclaustre y finja que es usted feliz') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (5, 'Cuando termina el juego,el rey y el peón vuelven a la misma caja') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (6, 'Uno se hace mayor cuando deja de tener curiosidad por las cosas') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (7, 'Gasté parte de mi fortuna en fiestas, drogas y alcohol, el resto lo malgasté') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (8, 'Vive tal y como piensas o acabarás pensando tal y como vives O algo así') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (9, 'Aguanta el portoooooon! Aguanta el portónador! HODOR! HODOR! HODOR!') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (10,'No hables a no ser que tus palabras sean mejores que el silencio A no ser que el silencio se vuelva incómodo Si es así, di cualquier gilipollez') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (11,'No existe la más mínima prueba que apoye la idea de que la vida sea algo serio') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (12,'Una dieta equilibrada consiste en tener una galleta en cada mano') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (13,'Si tienes que escoger entre dos males, elige el que no hayas probado antes A ver si así dejáis de votar al PP') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (14,'Jamás han matado a nadie mientras lavaba los platos') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (15,'Los hombres son de la tierra, Las mujeres son de la tierra Supéralo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (16,'Para cada acción, hay un programa gubernamental contrario de igual fuerza') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (17,'Siempre hay un tonto más de lo que creías') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (18,'Hoy hace un bonito día verás cómo viene alguien y te lo jode') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (19,'Llora, llora que menos meas') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (20,'Todas las opiniones son igual de validas menos la de los seres humanos') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (21,'Hola, me llamo Iñigo Montoya, tú mataste a mi padre Prepárate a morir') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (22,'Si alguien te quita el marido, la mejor venganza es dejar que se lo quede jojojo') ON CONFLICT DO NOTHING;
  INSERT INTO ADVICES (USERID, sentence) values (23,'Hostia! Que hambre me está entrando!') ON CONFLICT DO NOTHING;
EOSQL