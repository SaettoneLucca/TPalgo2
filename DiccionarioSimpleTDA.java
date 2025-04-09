package TPO;

public interface DiccionarioSimpleTDA {
    void InicializarDiccionario();                  // Pre: no aplica
    void Agregar(int clave, int valor);             // Pre: diccionario inicializado
    void Eliminar(int clave);                       // Pre: diccionario inicializado
    int Recuperar(int clave);                       // Pre: diccionario inicializado y clave existente
}

