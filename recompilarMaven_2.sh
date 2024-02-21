
DIRETORIO_BASE=/home/e164330/IdeaProjects/primeiros_passos_spring
JAVA_HOME=/usr/lib/jvm/java-1.17.0-openjdk-amd64 
M2_HOME=/usr/local/pje/apache-maven-3.8.1
MAVEN_OPTS="-Xms768m -Xmx2048m"

MAVEN_3_9_HOME=/home/e164330/.m2/wrapper/dists/apache-maven-3.9.5-bin/2adeog8mj13csp1uusqnc1f2mo/apache-maven-3.9.5

export JAVA_HOME=$JAVA_HOME
export M2_HOME=$M2_HOME

#~/shell_scripts/ALTERNAR_VERSOES_JAVA.sh 17

echo $JAVA_HOME

if [[ "$1" -eq "9" ]];
then 
	echo "VERSÃO DO MAVEN A SER UTILIZADA: $MAVEN_3_9_HOME"
	M2_HOME=$MAVEN_3_9_HOME

fi

cd $DIRETORIO_BASE
$M2_HOME/bin/mvn --version 
$M2_HOME/bin/mvn clean compile package -DskipTests=false

