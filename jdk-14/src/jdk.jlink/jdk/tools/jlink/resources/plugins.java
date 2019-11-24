package jdk.tools.jlink.resources;

import java.util.ListResourceBundle;

public final class plugins extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "add-options.argument", "<options>" },
            { "add-options.description", "Prepend the specified <options> string, which may include\nwhitespace, before any other options when invoking the virtual machine\nin the resulting image." },
            { "class-for-name.argument", "" },
            { "class-for-name.description", "Class optimization: convert Class.forName calls to constant loads." },
            { "compact-cp.argument", "<resource paths>" },
            { "compact-cp.description", "Constant Pool strings sharing.\nBy default, all resources are compressed. You can express the set \nof resources to compress or not compress (use ^ for negation)." },
            { "compress.argument", "<0|1|2>[:filter=<pattern-list>]" },
            { "compress.description", "Compress all resources in the output image.\nLevel 0: No compression\nLevel 1: Constant string sharing\nLevel 2: ZIP.\nAn optional <pattern-list> filter can be specified to list the pattern of\nfiles to be included." },
            { "dedup-legal-notices.argument", "[error-if-not-same-content]" },
            { "dedup-legal-notices.description", "De-duplicate all legal notices.  If error-if-not-same-content is\nspecified then it will be an error if two files of the same filename\nare different." },
            { "err.dir.already.exits", "directory already exists: {0}" },
            { "err.invalid.index", "invalid index for option {0}" },
            { "err.no.plugins.path", "No plugins path argument." },
            { "err.no.such.plugin", "No such plugin: {0}" },
            { "err.plugin.conflicts", "{0} ({1}) conflicts with {2}. Please use one or the other, but not both." },
            { "err.plugin.mutiple.options", "More than one plugin enabled by {0} option" },
            { "err.plugin.option.not.set", "Option {0} must be set." },
            { "err.provider.additional.arg.error", "Error in additional argument specification in {0} option: {1}" },
            { "err.provider.not.functional", "The provider {0} is not functional." },
            { "exclude-files.argument", "<pattern-list> of files to exclude" },
            { "exclude-files.description", "Specify files to exclude. e.g.: **.java,glob:/java.base/lib/client/**" },
            { "exclude-jmod-section.argument", "<section-name>\nwhere <section-name> is \"man\" or \"headers\"." },
            { "exclude-jmod-section.description", "Specify a JMOD section to exclude" },
            { "exclude-resources.argument", "<pattern-list> resources to exclude" },
            { "exclude-resources.description", "Specify resources to exclude. e.g.: **.jcov,glob:**/META-INF/**" },
            { "generate-jli-classes.argument", "@filename" },
            { "generate-jli-classes.description", "Specify a file listing the java.lang.invoke classes to pre-generate. \nBy default, this plugin may use a builtin list of classes to pre-generate. \nIf this plugin runs on a different runtime version than the image being \ncreated then code generation will be disabled by default to guarantee \ncorrectness - add ignore-version=true to override this." },
            { "include-locales.argument", "<langtag>[,<langtag>]*" },
            { "include-locales.description", "BCP 47 language tags separated by a comma, allowing locale matching\ndefined in RFC 4647. e.g.: en,ja,*-IN" },
            { "include-locales.invalidtag", "Invalid language tag: %s" },
            { "include-locales.localedatanotfound", "jdk.localedata module was not specified with --add-modules option" },
            { "include-locales.missingpackages", "Missing locale data packages in jdk.localedata:\n\t" },
            { "include-locales.nomatchinglocales", "No matching locales found for \"%s\". Check the specified pattern." },
            { "main.plugin.argument", "Argument" },
            { "main.plugin.category", "Category" },
            { "main.plugin.class", "Plugin Class" },
            { "main.plugin.description", "Description" },
            { "main.plugin.module", "Plugin Module" },
            { "main.plugin.name", "Plugin Name" },
            { "main.plugin.no.value", "<empty>" },
            { "main.plugin.option", "Option" },
            { "main.plugin.post.processors", "Image Post Processors:" },
            { "main.plugin.range.from", "Range from" },
            { "main.plugin.range.to", "to" },
            { "main.plugin.state", "Functional state" },
            { "main.status.not.ok", "Not functional." },
            { "main.status.ok", "Functional." },
            { "onoff.argument", "<on|off>" },
            { "order-resources.argument", "<pattern-list> of paths in priority order.  If a @file\nis specified, then each line should be an exact match for the path to be ordered" },
            { "order-resources.description", "Order resources. e.g.: **/module-info.class,@classlist,/java.base/java/lang/**" },
            { "plugin.opt.compress", "  -c, --compress=<0|1|2>                Enable compression of resources:\n                                          Level 0: No compression\n                                          Level 1: Constant string sharing\n                                          Level 2: ZIP" },
            { "plugin.opt.disable-plugin", "      --disable-plugin <pluginname>     Disable the plugin mentioned" },
            { "plugin.opt.list-plugins", "      --list-plugins                    List available plugins" },
            { "plugin.opt.no-header-files", "      --no-header-files                 Exclude include header files" },
            { "plugin.opt.no-man-pages", "      --no-man-pages                    Exclude man pages" },
            { "plugin.opt.post-process-path", "      --post-process-path <imagefile>   Post process an existing image" },
            { "plugin.opt.resources-last-sorter", "      --resources-last-sorter <name>    The last plugin allowed to sort\n                                        resources" },
            { "plugin.opt.strip-debug", "  -G, --strip-debug                     Strip debug information" },
            { "plugin.plugins.header", "List of available plugin options:" },
            { "release-info.argument", "<file>|add:<key1>=<value1>:<key2>=<value2>:...|del:<key list>" },
            { "release-info.description", "<file> option is to load release properties from the supplied file.\nadd: is to add properties to the 'release' file.\nAny number of <key>=<value> pairs can be passed.\ndel: is to delete the list of keys in release file." },
            { "strip-debug.description", "Strip debug information from the output image" },
            { "strip-java-debug-attributes.description", "Strip Java debug attributes from classes in the output image" },
            { "strip-native-commands.description", "Exclude native commands (such as java/java.exe) from the image" },
            { "system-modules.argument", "retainModuleTarget" },
            { "system-modules.description", "Fast loading of module descriptors (always enabled)" },
            { "vendor-bug-url.argument", "<vendor-bug-url>" },
            { "vendor-bug-url.description", "Override the vendor bug URL baked into the build.  The value\nof the system property \"java.vendor.url.bug\" will be <vendor-url-bug>." },
            { "vendor-version.argument", "<vendor-version>" },
            { "vendor-version.description", "Override the vendor version string baked into the build, if any.\nThe value of the system property \"java.vendor.version\" will be <vendor-version>." },
            { "vendor-vm-bug-url.argument", "<vendor-vm-bug-url>" },
            { "vendor-vm-bug-url.description", "Override the vendor VM bug URL baked into the build.  The URL\ndisplayed in VM error logs will be <vendor-vm-bug-url>." },
            { "vm.argument", "<client|server|minimal|all>" },
            { "vm.description", "Select the HotSpot VM in the output image.  Default is all" },
            { "warn.thirdparty.plugins", "Enabling third party plugins can lead to unusable generated image." },
            { "warn.thirdparty.plugins.enabled", "You have enabled third party plugins." },
            { "zip.argument", "[comma separated list of resource paths]" },
            { "zip.description", "ZIP Compression" },
        };
    }
}