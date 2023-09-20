// Tipo Abstrato de Dados (TAD) esfera
struct esfera {
    double raio;
};

typedef struct esfera Esfera;

// Funções exportadas:
// "Construtor": Aloca e retorna uma esfera.
Esfera* create (double raio);

// Função destroy: Libera a memória alocada por uma esfera.
void destroy(Esfera* e);

// Função getter: Retorna o raio da esfera.
double getRaio(Esfera* e);

// Função getter: Retorna o diâmetro da esfera.
double getDiametro(Esfera* e);

// Função getter: Retorna a área da esfera.
double getArea(Esfera* e);

// Função getter: Retorna o volume da esfera.
double getVolume(Esfera* e);
