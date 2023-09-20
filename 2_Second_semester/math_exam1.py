""" Questão 3: """

def questao3():
    listaA = {1,2}
    partesA = set()

    for x in listaA:
        for y in listaA:
            if x == y:
                 partesA.add(x)
            elif (y,x) in partesA:
                partesA.add(0)
            else:
                partesA.add((x,y))              

    # partesPartesA = [{x1,x2} for x1 in partesA for x2 in partesA]
    partesPartesA = set()

    for x1 in partesA:
            for x2 in partesA:
                if x1 == x2:
                    partesPartesA.add(x1)
                else:
                    partesPartesA.add((x1,x2))

    return partesPartesA

    
""" Questão 4: """
u = {0,1,2,3,4,5,6,7,8,9}
a = {1,2,3,4}
b = {3,4,5,6,7}
c = {6,7,8,9}

# Questão A
def questA():
    BuC = b.union(c)
    return a.difference(BuC)

# Questão B
def questB():
    BminusA = b.difference(a)
    CminusB = c.difference(b)
    return BminusA.intersection(CminusB) if BminusA.intersection(CminusB) else "Vazio"

# Questão C
def questC():
    AunionB = a.union(b)
    return u.difference(AunionB)

# Questão D
def questD():
    notA = u.difference(a)
    notB = u.difference(b)
    notC = u.difference(c)
    return notA.intersection(notB,notC)

# Questão E
def questE():
    AuniB = a.union(b)
    BuniC = b.union(c)
    notAuB = u.difference(AuniB)
    notBuC = u.difference(BuniC)
    return u.difference(notAuB.intersection(notBuC))


# Questão 3
# print(questao3())

# Questão 4
print(questA())
print(questB())
print(questC())
print(questD())
print(questE())