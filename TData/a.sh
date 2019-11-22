## generates lifts
LIST="Benches Deadlifts Squats"
for i in $LIST; do
	if [ -f TLifts_$i.java ]; then
		echo "Spotted an old $i. Removing..."
		rm TLifts_$i.java;
	fi
	sed -e "s/LiftType/$i/g" TLTemp > TLifts_$i.java;
done
