# clj-petnames

A clojure implementation of petnames (https://github.com/dustinkirkland/golang-petname)

petname − a utility to generate "pet names", consisting of a random combination of adverbs, an adjective, and an animal name

## Usage
```
-w, --words INT      2  number of words in the name
-l, --letters INT    0  number of letters in each word
-s, --seperator SEP  -  seperator string used to seperate words
-u, --ubuntu CHAR       ubuntu generate ubuntu-style names, alliteration of given character of each word
-h, --help
```

## Description

This utility will generate "pet names", consisting of a random combination of an adverb, adjective, and an animal name. These are useful for unique hostnames or container names, for instance.

As such, PetName tries to follow the tenets of Zooko’s triangle. Names are:

human meaningful
decentralized
secure

## License

Copyright © 2017 Matt Williams

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
