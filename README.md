# Sorting

Implementare i seguenti algoritmi di ordinamento:

- Insertion Sort
- Quick Sort
- Merge Sort
- Heap Sort

Ogni algoritmo va implementato in modo tale da poter essere utilizzato su
un generico tipo ```T```. L'implementazione degli algoritmi deve permettere di
specificare il criterio secondo cui ordinare i dati. *Suggerimento*: Usare
l'interfaccia java.util.Comparator (o, nel caso di una implementazione C,
un puntatore a funzione).

### Unit testing

Implementare gli unit-test degli algoritmi secondo le indicazioni
suggerite nel documento [Unit Testing](UnitTesting.md).

### Confronti

Il file `records.csv` che potete trovare seguendo il path
`/usr/NFS/Linux/labalgoritmi/datasets/` (in laboratorio von Neumann, selezionare
il disco Y) contiene 20 milioni di record da ordinare. Ogni record è descritto
su una riga e contiene i seguenti campi:

- id: (tipo intero) identificatore univoco del record;
- field1: (tipo stringa) contiene parole estratte dalla divina commedia,
  potete assumere che i valori non contengano spazi o virgole;
- field2: (tipo intero);
- field3: (tipo floating point);

Il formato è un CSV standard: i campi sono separati da virgole; i record sono
separati da "\n".

Usando ciascuno degli algoritmi implementati, si ordinino i dati contenuti nel
file `records.csv` in ordine non decrescente secondo i valori contenuti nei tre
campi "field" (i.e., per ogni algoritmo è necessario ripetere l'ordinamento tre
volte, una volta per ciascun campo).

Si misurino i tempi di risposta e si crei una breve relazione in cui si
riportano i risultati ottenuti insieme a un loro commento. Nel caso
l'ordinamento si  protragga per più di 10 minuti potete interrompere
l'esecuzione e riportare un fallimento dell'operazione. I risultati sono quelli
che vi sareste aspettati? Se sì, perché? Se no, fate delle ipotesi circa il
motivo per cui gli algoritmi non funzionano come vi aspettate, verificatele e
riportate quanto scoperto nella relazione. *Opzionale:* avete qualche idea per
risolvere gli eventuali problemi riscontrati? Se sì implementatela e verificate
se e come la situazione migliora.
