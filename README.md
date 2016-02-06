Este es un proyecto para construir una lista en Android paso a paso.

La version 1 de praiapp es una lista muy simple construida con un array adapter.
Solo se muestran los nombres de las playas.

Estos son los 3 archivos importantes:
activity_main.xml
list_item.xml
MainActivity.java

La version 2 es una lista construida con un adapter que extiende de Base Adapter.
Se muestran los nombres de las playas, el estado y una foto.
Ver http://www.pcsalt.com/android/listview-using-baseadapter-android/

Estos son los cambios importantes:
- creamos la clase Playa, nuestro modelo, en Playa.java. Definimos solo getters.
- creamos MyAdapter.java, nuestro adapter personalizado, extendiendo de BaseAdapter.
- modificamos listItem.xml. Ahora tiene una imageView y dos textView anidadas en otro LinearLayout.
- en MainActivity.java instanciamos la clase Playa y creamos un ArrayList con los objetos.
Tambien creamos un onItemClickListener que lanza un toast con el nombre de la playa.

La version 3 es una lista que inicia una pantalla con el detalle del item seleccionado.
Estos son los cambios importantes:
Creamos otra activity con el detalle (Detalle.java).
Creamos un onItemClickListener que lanza la pantalla con el detalle.
