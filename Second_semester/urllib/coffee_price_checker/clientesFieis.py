def comprarCafeClienteFiel():
    import urllib.request

    # Clientes fiéis
    paginaLCB = urllib.request.urlopen("http://beans.itcarlow.ie/prices-loyalty.html")
    textoLCB  = paginaLCB.read().decode("utf8")
    inicioLCB  = textoLCB.find(">$") + 2
    fimLCB  = inicioLCB + 4
    precoLCB  = textoLCB[inicioLCB:fimLCB]
    precoLCB = float(precoLCB)

    if precoLCB < 4.74:
        return (f"Comprar! Preço: {precoLCB}")
    else:
        return (f"Espere! Preço: {precoLCB}")