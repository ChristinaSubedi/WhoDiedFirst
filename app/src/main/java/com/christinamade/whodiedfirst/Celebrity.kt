package com.christinamade.whodiedfirst

import kotlin.random.Random

data class Celebrity(val name: String, val deathYear: Int)
class CelebrityManager {
    private var celebrities:MutableSet<Celebrity> = mutableSetOf()
    init{
        initializeCelebrities()
    }
    private fun initializeCelebrities(){
    celebrities = mutableSetOf(
        Celebrity("Cleopatra", 30),
        Celebrity("Julius Caesar", 44),
        Celebrity("Buddha", -483),
        Celebrity("Alexander the Great", 323),
        Celebrity("Hannibal Barca", 181),
        Celebrity("Archimedes", 212),
        Celebrity("Socrates", 399),
        Celebrity("Aristotle", 322),
        Celebrity("Emperor Qin Shi Huang", -210),
        Celebrity("Genghis Khan", 1227),
        Celebrity("Leonardo da Vinci", 1519),
        Celebrity("Michelangelo", 1564),
        Celebrity("William Shakespeare", 1616),
        Celebrity("Galileo Galilei", 1642),
        Celebrity("Isaac Newton", 1727),
        Celebrity("Wolfgang Amadeus Mozart", 1791),
        Celebrity("Napoleon Bonaparte", 1821),
        Celebrity("Ludwig van Beethoven", 1827),
        Celebrity("Charles Darwin", 1882),
        Celebrity("Queen Victoria", 1901),
        Celebrity("Pablo Picasso", 1973),
        Celebrity("Albert Einstein", 1955),
        Celebrity("Mahatma Gandhi", 1948),
        Celebrity("Franklin D. Roosevelt", 1945),
        Celebrity("Winston Churchill", 1965),
        Celebrity("Adolf Hitler", 1945),
        Celebrity("Joseph Stalin", 1953),
        Celebrity("John F. Kennedy", 1963),
        Celebrity("Martin Luther King Jr.", 1968),
        Celebrity("Malcolm X", 1965),
        Celebrity("Nelson Mandela", 2013),
        Celebrity("Mother Teresa", 1997),
        Celebrity("Princess Diana", 1997),
        Celebrity("Elvis Presley", 1977),
        Celebrity("Marilyn Monroe", 1962),
        Celebrity("Jimi Hendrix", 1970),
        Celebrity("John Lennon", 1980),
        Celebrity("Queen Nefertiti", -1330),
        Celebrity("Ramses II", -1213),
        Celebrity("Joan of Arc", 1431),
        Celebrity("Marco Polo", 1324),
        Celebrity("Anne Frank", 1945),
        Celebrity("Amelia Earhart", 1937),
        Celebrity("Richard Nixon", 1994),
        Celebrity("Marie Antoinette", 1793),
        Celebrity("Vincent van Gogh", 1890),
        Celebrity("Queen Elizabeth I", 1603),
        Celebrity("Christopher Columbus", 1506),
        Celebrity("Hernán Cortés", 1547),
        Celebrity("Captain James Cook", 1779),
        Celebrity("Ernest Hemingway", 1961),
        Celebrity("Winston Churchill", 1965),
        Celebrity("Marie Curie", 1934),
        Celebrity("Charles Dickens", 1870),
        Celebrity("Emily Dickinson", 1886),
        Celebrity("Thomas Edison", 1931),
        Celebrity("Elizabeth Taylor", 2011),
        Celebrity("Bruce Lee", 1973),
        Celebrity("Cleopatra VII", -30),
        Celebrity("Mary Magdalene", 1),
        Celebrity("Richard the Lionheart", 1199),
        Celebrity("Robin Hood", 12),
        Celebrity("Al Capone", 1947),
        Celebrity("Josephine Baker", 1975),
        Celebrity("Audrey Hepburn", 1993),
        Celebrity("George Washington", 1799),
        Celebrity("Mark Twain", 1910),
        Celebrity("Vladimir Lenin", 1924),
        Celebrity("Salvador Dalí", 1989),
        Celebrity("Henry VIII", 1547),
        Celebrity("Catherine the Great", 1796),
        Celebrity("Benjamin Franklin", 1790),
        Celebrity("John Adams", 1826),
        Celebrity("Thomas Jefferson", 1826),
        Celebrity("James Madison", 1836),
        Celebrity("William the Conqueror", 1087),
        Celebrity("Attila the Hun", 453),
        Celebrity("Ramses III", -1155),
        Celebrity("Eleanor Roosevelt", 1962),
        Celebrity("Hellen Keller", 1968),
        Celebrity("Harry Houdini", 1926),
        Celebrity("Christopher Columbus", 1506),
        Celebrity("Hernán Cortés", 1547),
        Celebrity("Francisco Pizarro", 1541),
        Celebrity("Joan of Arc", 1431),
        Celebrity("Catherine de' Medici", 1589),
        Celebrity("Cleopatra VII", -30),
        Celebrity("Napoleon Bonaparte", 1821),
        Celebrity("Joseph Stalin", 1953),
        Celebrity("Mao Zedong", 1976),
        Celebrity("Che Guevara", 1967),
        Celebrity("Fidel Castro", 2016),
        Celebrity("Steve Jobs", 2011),
        Celebrity("Mark Twain", 1910),
        Celebrity("Vladimir Lenin", 1924),
        Celebrity("Salvador Dalí", 1989),
        Celebrity("Henry VIII", 1547),
        Celebrity("Catherine the Great", 1796),
        Celebrity("Benjamin Franklin", 1790),
        Celebrity("John Adams", 1826),
        Celebrity("Thomas Jefferson", 1826),
        Celebrity("James Madison", 1836),
        Celebrity("William the Conqueror", 1087),
        Celebrity("Attila the Hun", 453),
        Celebrity("Ramses III", -1155),
        Celebrity("Eleanor Roosevelt", 1962),
        Celebrity("Hellen Keller", 1968),
        Celebrity("Harry Houdini", 1926),
        Celebrity("George Washington", 1799),
        Celebrity("Benjamin Franklin", 1790),
        Celebrity("John Adams", 1826),
        Celebrity("Thomas Jefferson", 1826),
        Celebrity("James Madison", 1836),
        Celebrity("Christopher Columbus", 1506),
        Celebrity("Hernán Cortés", 1547),
        Celebrity("Francisco Pizarro", 1541),
        Celebrity("Joan of Arc", 1431),
        Celebrity("Catherine de' Medici", 1589),
        Celebrity("Cleopatra VII", -30),
        Celebrity("Napoleon Bonaparte", 1821),
        Celebrity("Joseph Stalin", 1953),
        Celebrity("Mao Zedong", 1976),
        Celebrity("Che Guevara", 1967),
        Celebrity("Harriet Tubman", 1913),
        Celebrity("Susan B. Anthony", 1906),
        Celebrity("Amelia Earhart", 1937),
        Celebrity("Amelia Earhart", 1937),
        Celebrity("Jane Austen", 1817),
        Celebrity("Emily Dickinson", 1886),
        Celebrity("Agatha Christie", 1976),
        Celebrity("Virginia Woolf", 1941),
        Celebrity("J.R.R. Tolkien", 1973),
        Celebrity("H.G. Wells", 1946),
        Celebrity("Ernest Hemingway", 1961),
        Celebrity("George Orwell", 1950),
        Celebrity("Walt Disney", 1966),
        Celebrity("Jim Henson", 1990),
        Celebrity("Michael Jordan", 2020),
        Celebrity("Muhammad Ali", 2016),
        Celebrity("Babe Ruth", 1948),
        Celebrity("Pelé", 2022),
        Celebrity("Pablo Neruda", 1973),
        Celebrity("Gabriel García Márquez", 2014),
        Celebrity("Frida Kahlo", 1954),
        Celebrity("Diego Rivera", 1957),
        Celebrity("Joseph Haydn", 1809),
        Celebrity("Johannes Brahms", 1897),
        Celebrity("Richard Wagner", 1883),
        Celebrity("Wolfgang Amadeus Mozart", 1791),
        Celebrity("Ludwig van Beethoven", 1827),
        Celebrity("Franz Schubert", 1828),
        Celebrity("Johann Sebastian Bach", 1750),
        Celebrity("Pyotr Ilyich Tchaikovsky", 1893),
        Celebrity("Claude Debussy", 1918),
        Celebrity("George Gershwin", 1937),
        Celebrity("John Lennon", 1980),
        Celebrity("Bob Marley", 1981),
        Celebrity("Freddie Mercury", 1991),
        Celebrity("Jim Morrison", 1971),
        Celebrity("Kurt Cobain", 1994),
        Celebrity("Amy Winehouse", 2011),
        Celebrity("Whitney Houston", 2012),
        Celebrity("Elvis Presley", 1977),
        Celebrity("Michael Jackson", 2009),
        Celebrity("Prince", 2016),
        Celebrity("David Bowie", 2016),
        Celebrity("Aretha Franklin", 2018),
        Celebrity("Ray Charles", 2004),
        Celebrity("Johnny Cash", 2003),
        Celebrity("Frank Sinatra", 1998),
        Celebrity("Ella Fitzgerald", 1996),
        Celebrity("Louis Armstrong", 1971),
        Celebrity("Miles Davis", 1991),
        Celebrity("Charlie Parker", 1955),
        Celebrity("Buddy Holly", 1959),
        Celebrity("John Coltrane", 1967),
        Celebrity("Duke Ellington", 1974),
        Celebrity("Thelonious Monk", 1982),
        Celebrity("Billie Holiday", 1959),
        Celebrity("Judy Garland", 1969),
        Celebrity("Marilyn Monroe", 1962),
        Celebrity("Audrey Hepburn", 1993),
        Celebrity("Grace Kelly", 1982),
        Celebrity("Elizabeth Taylor", 2011),
        Celebrity("Sophia Loren", 2023),
        Celebrity("Jesus Christ", 33),
        Celebrity("Confucius", -479),
        Celebrity("Siddhartha Gautama (Buddha)", -483),
        Celebrity("Moses", -1273),
        Celebrity("King Solomon", -931),
        Celebrity("Homer", -800),
        Celebrity("King Arthur", 537),
        Celebrity("William the Conqueror", 1087),
        Celebrity("Saladin", 1193),
        Celebrity("Eleanor of Aquitaine", 1204),
        Celebrity("William Wallace", 1305),
        Celebrity("Marco Polo", 1324),
        Celebrity("Geoffrey Chaucer", 1400),
        Celebrity("Joan of Arc", 1431),
        Celebrity("Leon Battista Alberti", 1472),
        Celebrity("Christopher Columbus", 1506),
        Celebrity("Vasco da Gama", 1524),
        Celebrity("Niccolò Machiavelli", 1527),
        Celebrity("Anne Boleyn", 1536),
        Celebrity("Jacques Cartier", 1557),
        Celebrity("Mary, Queen of Scots", 1587),
        Celebrity("Tokugawa Ieyasu", 1616),
        Celebrity("Galileo Galilei", 1642),
        Celebrity("Oliver Cromwell", 1658),
        Celebrity("Molière", 1673),
        Celebrity("Peter the Great", 1725),
        Celebrity("Voltaire", 1778),
        Celebrity("Catherine the Great", 1796),
        Celebrity("Jean-Jacques Rousseau", 1778),
        Celebrity("Thomas Jefferson", 1826),
        Celebrity("Beethoven", 1827),
        Celebrity("John Quincy Adams", 1848),
        Celebrity("Leo Tolstoy", 1910),
        Celebrity("Queen Victoria", 1901),
        Celebrity("Mark Twain", 1910),
        Celebrity("Woodrow Wilson", 1924),
        Celebrity("H.P. Lovecraft", 1937),
        Celebrity("Nikola Tesla", 1943),
        Celebrity("Alfred Wegener", 1930),
        Celebrity("Hermann Hesse", 1962),
        Celebrity("J.R.R. Tolkien", 1973),
        Celebrity("Aldous Huxley", 1963),
        Celebrity("Dwight D. Eisenhower", 1969),
        Celebrity("Haile Selassie", 1975),
        Celebrity("John D. Rockefeller", 1937),
        Celebrity("Mohandas Karamchand Gandhi", 1948),
        Celebrity("Eva Perón", 1952),
        Celebrity("Alan Turing", 1954),
        Celebrity("Rosa Parks", 2005),
        Celebrity("Ayrton Senna", 1994),
        Celebrity("Leonhard Euler", 1783),
        Celebrity("Johann Sebastian Bach", 1750),
        Celebrity("Pyotr Ilyich Tchaikovsky", 1893),
        Celebrity("Johannes Brahms", 1897),
        Celebrity("Franz Schubert", 1828),
        Celebrity("Richard Wagner", 1883),
        Celebrity("Antonín Dvořák", 1904),
        Celebrity("Claude Monet", 1926),
        Celebrity("Pierre-Auguste Renoir", 1919),
        Celebrity("Mary Cassatt", 1926),
        Celebrity("Gustav Klimt", 1918),
        Celebrity("Thomas Edison", 1931),
        Celebrity("Nikola Tesla", 1943),
        Celebrity("Marie Curie", 1934),
        Celebrity("George Washington Carver", 1943),
        Celebrity("Sigmund Freud", 1939),
        Celebrity("Rosalind Franklin", 1958),
        Celebrity("Leo Szilard", 1964),
        Celebrity("Niels Bohr", 1962),
        Celebrity("Erwin Schrödinger", 1961),
        Celebrity("Paul Dirac", 1984),
        Celebrity("Enrico Fermi", 1954),
        Celebrity("Lise Meitner", 1968),
        Celebrity("Emmy Noether", 1935),
        Celebrity("Carl Friedrich Gauss", 1855),
        Celebrity("Isaac Newton", 1727),
        Celebrity("Gottfried Wilhelm Leibniz", 1716),
        Celebrity("Leonhard Euler", 1783),
        Celebrity("Andrew Carnegie", 1919),
        Celebrity("J.P. Morgan", 1913),
        Celebrity("Cornelius Vanderbilt", 1877),
        Celebrity("John D. Rockefeller", 1937),
        Celebrity("Steve Jobs", 2011),
        Celebrity("Pablo Escobar", 1993),
        Celebrity("Pope John Paul II", 2005),
        Celebrity("Saddam Hussein", 2006),
        Celebrity("Muammar Gaddafi", 2011),
        Celebrity("Kim Jong-il", 2011),
        Celebrity("Osama bin Laden", 2011),
        Celebrity("Fidel Castro", 2016),
        Celebrity("Che Guevara", 1967),
        Celebrity("Mao Zedong", 1976),
        Celebrity("Joseph Stalin", 1953),
        Celebrity("Adolf Hitler", 1945),
        Celebrity("Benito Mussolini", 1945),
        Celebrity("Emperor Hirohito", 1989),
        Celebrity("Pol Pot", 1998),
        Celebrity("Joseph Goebbels", 1945),
        Celebrity("Heinrich Himmler", 1945),
        Celebrity("Rudolf Hess", 1987),
        Celebrity("Joseph Mengele", 1979),
        Celebrity("Anne Frank", 1945),
        Celebrity("Marie Antoinette", 1793),
        Celebrity("Queen Marie Antoinette", 1793),
        Celebrity("King Louis XVI", 1793),
        Celebrity("Robespierre", 1794),
        Celebrity("Empress Theodora", 548),
        Celebrity("Lady Jane Grey", 1554),
        Celebrity("Tsar Nicholas II", 1918),
        Celebrity("Tsarina Alexandra", 1918),
        Celebrity("Archduke Franz Ferdinand", 1914),
        Celebrity("Emperor Maximilian of Mexico", 1867),
        Celebrity("Empress Elisabeth of Austria", 1898),
        Celebrity("Michael Jackson", 2009),
        Celebrity("Marilyn Monroe", 1962),
        Celebrity("Kobe Bryant", 2020),
    )
    }

    fun pickRandomCelebrity() : Celebrity{
        if (celebrities.isEmpty()){
            initializeCelebrities();
        }
        var randomIndex= Random.nextInt(celebrities.size)
        val celebrityR=celebrities.elementAt(randomIndex)
        celebrities.remove(celebrityR)
        return celebrityR
    }
}



