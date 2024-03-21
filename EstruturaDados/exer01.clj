(defn criaLista [n lista]
    if(not= n 0)
        (criaLista (dec n) (cons n lista)
        lista))


