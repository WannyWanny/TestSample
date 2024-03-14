.PHONY: gen
gen:
	@./gradlew compileJava

.PHONY: clean
	@./gradlew clean

.PHONY: compile
compile:
	@./gradlew compileJava

.PHONY: run
run: compile
	@./gradlew bootRun

clean:
	@./gradlew clean