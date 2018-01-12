blink/blink.ino: blink.clj
	ferret -i $< -o $@

install: blink/blink.ino
	cd blink && arduino --upload *.ino

clean:
	rm -rf blink
