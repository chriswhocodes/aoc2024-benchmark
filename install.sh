mvn install:install-file -Dfile=../aoc2024/target/aoc2024-1.0-SNAPSHOT.jar -DgroupId=com.chrisnewland.aoc2024 -DartifactId=aoc2024 -Dversion=1.0.0 -Dpackaging=jar -DgeneratePom=true
mvn clean package
