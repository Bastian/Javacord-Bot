package org.javacord.bot.commands;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.bot.Constants;

/**
 * The !maven command which is used to get information about Javacord with Maven.
 */
public class MavenCommand implements CommandExecutor {

    @Command(aliases = {"!maven"}, async = true)
    public void onCommand(TextChannel channel) {
        EmbedBuilder embed = new EmbedBuilder()
                .setColor(Constants.JAVACORD_ORANGE)
                .addField("Dependency",
                          "```xml\n" +
                           "<dependency>\n" +
                           "    <groupId>org.javacord</groupId>\n" +
                           "    <artifactId>javacord</artifactId>\n" +
                           "    <version>3.0.0</version>\n" + // TODO Always use the latest version
                           "    <type>pom</type>\n" +
                           "</dependency>\n" +
                           "```")
                .addField("Setup Guides",
                          "• [IntelliJ](https://javacord.org/wiki/getting-started/intellij-maven/)\n" +
                          "• [Eclipse](https://javacord.org/wiki/getting-started/eclipse-maven/)");

        channel.sendMessage(embed).join();
    }
}