# No Chat Delay

A client-side mod that removes the internal processing delay for incoming Minecraft chat messages.

## What does this do?
In vanilla Minecraft, incoming chat messages are placed into a queue and tied to the game's tick rate. This creates an artificial delay (~50ms, but much worse if the server or client is lagging) between the network receiving a message and it actually appearing on your screen.

**No Chat Delay** bypasses this waiting period. It forces the game to process the message, verify signatures, and render the text on the exact same frame the packet arrives.

### Features:
* **Faster chat:** about 50ms or more depending on context.
* **Lag Resistant:** Chat renders instantly even if the server TPS drops.
* **High Compatibility:** Safely forces the vanilla processing queue rather than skipping it. It should not break chat filters, secure chat signatures, or chat loggers.
* **100% Client-Side:** Safe to use on any vanilla or modded multiplayer server.
* **Zero Dependencies:** Not even Fabric API

## Installation
1. Download the latest `.jar` from the [Releases](https://modrinth.com/project/no-chat-delay) page (or build it from source).
2. Drop the `.jar` file into your `.minecraft/mods` folder.
3. Launch the game

## Compile from Source
If you want to build the mod yourself:
1. Clone this repository.
2. Open a terminal in the project folder.
3. Run `./gradlew build`.
4. Grab the compiled mod from `build/libs/`.

## Mod in action
![mod_working.gif](media/mod_working.gif)