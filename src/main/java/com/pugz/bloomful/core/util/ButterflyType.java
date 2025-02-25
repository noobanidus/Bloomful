package com.pugz.bloomful.core.util;

import com.pugz.bloomful.common.entity.ButterflyEntity;

import java.util.ArrayList;
import java.util.List;

import static com.pugz.bloomful.common.entity.ButterflyEntity.Data;

public enum ButterflyType {
    TIGER(new Data("Orange Tiger", "#", "#"), new Data("Yellow Tiger", "#", "#"), new Data("Dark Glassy Tiger", "#", "#"), new Data("Blue Glassy Tiger", "#", "#")),
    MONARCH(new Data("Orange Monarch", "#", "#"), new Data("Yellow Monarch", "#", "#"), new Data("Pale Monarch", "#", "#")),
    CABBAGE(new Data("White Cabbage", "#", "#"), new Data("Yellow Cabbage", "#", "#")),
    SKIPPER(new Data("Arctic Skipper", "#", "#"), new Data("Sandhill Skipper", "#", "#"), new Data("Fiery Skipper", "#", "#"), new Data("Northern White Skipper", "#", "#"), new Data("Silver-Spotted  Skipper", "#", "#"), new Data("Woodland Skipper", "#", "#"), new Data("Coconut  Skipper", "#", "#"), new Data("Banana  Skipper", "#", "#")),
    COPPER(new Data("Copper", "#", "#"), new Data("Blue Copper", "#", "#"), new Data("Desert Tailed Copper", "#", "#"), new Data("Gorgon Copper", "#", "#"), new Data("Great Copper", "#", "#"), new Data("Lustrous Copper", "#", "#"), new Data("Purplish Copper", "#", "#"), new Data("Snowy Copper", "#", "#")),
    SWALLOWTAIL(new Data("Swallowtail", "#", "#"), new Data("Western Tiger Swallowtail", "#", "#"), new Data("Pale Swallowtail", "#", "#"), new Data("Pipevine Swallowtail", "#", "#"), new Data("Black Swallowtail", "#", "#"), new Data("Zebra Swallowtail", "#", "#")),
    SULPHUR(new Data("Sulphur", "#", "#"), new Data("Cloudless Sulphur", "#", "#"), new Data("Dainty Sulphur", "#", "#"), new Data("Orange Sulphur", "#", "#"), new Data("Yellow Sulphur", "#", "#")),
    DOG_FACE(new Data("Dog-Face", "#", "#")),
    LONGWING(new Data("Longwing", "#", "#")),
    PEARLY_EYE(new Data("Southern Pearly-Eye", "#", "#"), new Data("Northern Pearly-Eye", "#", "#")),
    BANNER(new Data("Banner", "#", "#"), new Data("Orange Banner", "#", "#")),
    NYPMH(new Data("Nymph", "#", "#")),
    ADMIRAL(new Data("Admiral", "#", "#"), new Data("Red Admiral", "#", "#"), new Data("White Admiral", "#", "#")),
    BUCKEYE(new Data("Buckeye", "#", "#"), new Data("Tropical Buckeye", "#", "#"), new Data("Mangrove Buckeye", "#", "#")),
    HAIRSTREAK(new Data("Bramble Hairstreak", "#", "#"), new Data("Golden Hairstreak", "#", "#"), new Data("Golden Oak Hairstreak", "#", "#"), new Data("Gray Hairstreak", "#", "#"), new Data("Great Purple Hairstreak", "#", "#"), new Data("Juniper Hairstreak", "#", "#"), new Data("Green Hairstreak", "#", "#"), new Data("Mahogany Hairstreak", "#", "#"), new Data("Sepia Hairstreak", "#", "#"), new Data("Thicket Hairstreak", "#", "#"), new Data("Willow Hairstreak", "#", "#"), new Data("Black Hairstreak", "#", "#")),
    GATEKEEPER(new Data("Gatekeeper", "#", "#")),
    GRAYLING(new Data("Grayling", "#", "#")),
    MOURNING_CLOAK(new Data("Mourning Cloak", "#", "#")),
    FRITALLARY(new Data("Dark Green Fritallary", "#", "#"), new Data("Heath Fritallary", "#", "#"), new Data("High Brown Fritallary", "#", "#"), new Data("Marsh Fritallary", "#", "#"), new Data("Pearl Fritallary", "#", "#"), new Data("Silver Fritallary", "#", "#"), new Data("Gulf Fritallary", "#", "#"), new Data("Spangled Fritallary", "#", "#"), new Data("Atlantis Fritallary", "#", "#"), new Data("Mountain Fritallary", "#", "#"), new Data("Meadow Fritallary", "#", "#"), new Data("Regal Fritallary", "#", "#"), new Data("Polaris Fritallary", "#", "#"), new Data("Cryptic Fritallary", "#", "#")),
    RINGLET(new Data("Ringlet", "#", "#"), new Data("Mountain Ringlet", "#", "#")),
    ARGUS(new Data("Argus", "#", "#"), new Data("Northern Brown Argus", "#", "#")),
    EMPEROR(new Data("Emperor", "#", "#"), new Data("Purple Emperor", "#", "#"), new Data("Hackberry Emperor", "#", "#"), new Data("Tawny Emperor", "#", "#"), new Data("Silver Emperor", "#", "#"), new Data("Dusky Emperor", "#", "#")),
    CLOUDY(new Data("Cloudy", "#", "#"), new Data("Yellow Cloudy", "#", "#")),
    DUSKY(new Data("Dreamy Dusky", "#", "#"), new Data("Mournful Dusky", "#", "#"), new Data("Sad Dusky", "#", "#"), new Data("Sleepy Dusky", "#", "#")),
    SOOTY(new Data("Sooty", "#", "#")),
    PYGMY(new Data("Pygmy", "#", "#"), new Data("Blue Pygmy", "#", "#")),
    ARROWHEAD(new Data("Arrowhead", "#", "#"), new Data("Blue Arrowhead", "#", "#")),
    GOSSAMER(new Data("Gossamer", "#", "#"), new Data("Sooty Gossamer", "#", "#")),
    AZURE(new Data("Azure", "#", "#"), new Data("Spring Azure", "#", "#")),
    ELFIN(new Data("Elfin", "#", "#"), new Data("Moss Elfin", "#", "#"), new Data("Western Pine Elfin", "#", "#"), new Data("Western Brown Elfin", "#", "#")),
    PARNASSIAN(new Data("Parnassian", "#", "#")),
    MARBLE(new Data("Gray Marble", "#", "#")),
    PATCH(new Data("Patch", "#", "#"), new Data("Bordered Patch", "#", "#"), new Data("Crimson Patch", "#", "#")),
    CRESCENT(new Data("Crescent", "#", "#"), new Data("Feather River Crescent", "#", "#"), new Data("Pearl Crescent", "#", "#"), new Data("Black Crescent", "#", "#"), new Data("Pine Crescent", "#", "#"), new Data("Chestnut Crescent", "#", "#"), new Data("Field Crescent", "#", "#"), new Data("Pale Crescent", "#", "#")),
    TORTOISESHELL(new Data("Tortoiseshell", "#", "#")),
    CHECKERSPOT(new Data("Northern Checkerspot", "#", "#"), new Data("Arachne Checkerspot", "#", "#"), new Data("Black Checkerspot", "#", "#"), new Data("Silvery Checkerspot", "#", "#")),
    COMMA(new Data("Comma", "#", "#"), new Data("Green Comma", "#", "#"), new Data("Gray Comma", "#", "#")),
    SATYR(new Data("Ox-Eyed Satyr", "#", "#"), new Data("Anglewing Satyr", "#", "#"), new Data("Canyonland Satyr", "#", "#"), new Data("Red Satyr", "#", "#"), new Data("Pine Satyr", "#", "#"), new Data("White Satyr", "#", "#")),
    QUEEN(new Data("Queen", "#", "#")),
    SILVERSPOT(new Data("Silverspot", "#", "#")),
    SISTER(new Data("Eyed Sister", "#", "#"), new Data("Rayed Sister", "#", "#")),
    MORPHO(new Data("White Morpho", "#", "#")),
    COMMODORE(new Data("Commodore", "#", "#")),
    LACEWING(new Data("Lacewing", "#", "#"), new Data("Malay Lacewing", "#", "#"), new Data("Leopard Lacewing", "#", "#")),
    APOLLO(new Data("Apollo", "#", "#")),
    SHOEMAKER(new Data("Shoemaker", "#", "#")),
    FESTOON(new Data("Festoon", "#", "#")),
    JEWEL(new Data("Jewel", "#", "#"), new Data("Western Jewel", "#", "#"), new Data("Bulloak Jewel", "#", "#")),
    MIMIC(new Data("Mimic", "#", "#")),
    BEAUTY(new Data("Beauty", "#", "#")),
    CHALKHILL(new Data("Chalkhill", "#", "#")),
    METALMARK(new Data("Metalmark", "#", "#")),
    ORANGETIP(new Data("Orangetip", "#", "#"), new Data("Great Orangetip", "#", "#")),
    HELICONIAN(new Data("Heliconian", "#", "#")),
    DAGGERWING(new Data("Daggerwing", "#", "#"), new Data("Waiter Daggerwing", "#", "#"), new Data("Ruddy Daggerwing", "#", "#")),
    VICEROY(new Data("Viceroy", "#", "#")),
    MALACHITE(new Data("Malachite", "#", "#")),
    PAGE(new Data("Page", "#", "#")),
    WALL(new Data("Wall", "#", "#")),
    MEADOW(new Data("Meadow", "#", "#")),
    OWLET(new Data("Owlet", "#", "#"), new Data("Orange Owlet", "#", "#")),
    SNOUT(new Data("Snout", "#", "#")),
    EYED(new Data("Eyed", "#", "#")),
    DASH(new Data("Dash", "#", "#")),
    HARVESTER(new Data("Harvester", "#", "#")),
    BRIMSTONE(new Data("Brimstone", "#", "#")),
    QUESTION_MARK(new Data("Question Mark", "#", "#")),
    ADONIS(new Data("Adonis", "#", "#")),
    SUNSET(new Data("Sunset", "#", "#")),
    POSTMAN(new Data("Postman", "#", "#")),
    DUKE(new Data("Purple Duke", "#", "#")),
    GLASSWING(new Data("Glasswing", "#", "#")),
    ROSE(new Data("Rose", "#", "#")),
    CHECKERED(new Data("Checkered", "#", "#")),
    SPICEBUSH(new Data("Spicebush", "#", "#")),
    HEATH(new Data("Heath", "#", "#")),
    HOLLY(new Data("Holly", "#", "#")),
    PEACOCK(new Data("Peacock", "#", "#"), new Data("White Peacock", "#", "#"), new Data("Banded Peacock", "#", "#")),
    CLOUDLESS(new Data("Cloudless", "#", "#")),
    LEAFWING(new Data("Leafwing", "#", "#"), new Data("Angled Leafwing", "#", "#"), new Data("Pointed Leafwing", "#", "#"), new Data("Tropical Leafwing", "#", "#"), new Data("Goatweed Leafwing", "#", "#"), new Data("Pale-Spotted Leafwing", "#", "#")),
    CLEARWING(new Data("Clearwing", "#", "#")),
    EDGE(new Data("Edge", "#", "#")),
    LADY(new Data("West Coast Lady", "#", "#"), new Data("Painted Lady", "#", "#")),
    ALPINE(new Data("Alpine", "#", "#"), new Data("Taiga Alpine", "#", "#"), new Data("Reddish Alpine", "#", "#"), new Data("Eskimo Alpine", "#", "#"), new Data("Banded Alpine", "#", "#")),
    ARCTIC(new Data("Arctic", "#", "#"), new Data("Great Arctic", "#", "#"), new Data("Arctic Sentinel", "#", "#"), new Data("Early Arctic", "#", "#")),
    SILVERLINE(new Data("Silverline", "#", "#")),
    SPRITE(new Data("Sprite", "#", "#")),
    VIRGIN(new Data("Virgin", "#", "#")),
    BIRDWING(new Data("Birdwing", "#", "#")),
    MIME(new Data("Mime", "#", "#")),
    HELEN(new Data("Helen", "#", "#"), new Data("Great Helen", "#", "#"), new Data("Blue Helen", "#", "#")),
    MORMON(new Data("Mormon", "#", "#"), new Data("Great Mormon", "#", "#")),
    BLUEBOTTLE(new Data("Bluebottle", "#", "#")),
    JAY(new Data("Jay", "#", "#"), new Data("Blue Jay", "#", "#"), new Data("Tailed Jay", "#", "#")),
    SWORDTAIL(new Data("Swordtail", "#", "#")),
    JEZEBEL(new Data("Jezebel", "#", "#"), new Data("Red Jezebel", "#", "#"), new Data("Painted Jezebel", "#", "#")),
    PSYCHE(new Data("Psyche", "#", "#")),
    ALBATROSS(new Data("Albatross", "#", "#"), new Data("Chocolate Albatross", "#", "#"), new Data("Striped Albatross", "#", "#")),
    EMIGRANT(new Data("Emigrant", "#", "#"), new Data("Mottled Emigrant", "#", "#"), new Data("Orange Emigrant", "#", "#")),
    CROW(new Data("Black Crow", "#", "#"), new Data("Malayan Crow", "#", "#"), new Data("Blue Crow", "#", "#"), new Data("King Crow", "#", "#"), new Data("Dwarf Crow", "#", "#"), new Data("Magpie Crow", "#", "#")),
    PALMFLY(new Data("Palmfly", "#", "#"), new Data("Tawny Palmfly", "#", "#"), new Data("Pointed Palmfly", "#", "#")),
    RING(new Data("Ring", "#", "#")),
    FAUN(new Data("Faun", "#", "#")),
    KING(new Data("King", "#", "#"), new Data("Palm King", "#", "#")),
    SATURN(new Data("Saturn", "#", "#")),
    GLORY(new Data("Glory", "#", "#"), new Data("Dark Blue Glory", "#", "#")),
    DUFFER(new Data("Duffer", "#", "#")),
    EGGFLY(new Data("Malayan Eggfly", "#", "#"), new Data("Great Eggfly", "#", "#")),
    PANSY(new Data("Pansy", "#", "#"), new Data("Chocolate Pansy", "#", "#"), new Data("Peacock Pansy", "#", "#"), new Data("Gray Pansy", "#", "#"), new Data("Blue Pansy", "#", "#")),
    LEOPARD(new Data("Leopard", "#", "#")),
    ASSYRIAN(new Data("Royal Assyrian", "#", "#")),
    CRUISER(new Data("Cruiser", "#", "#")),
    RUSTIC(new Data("Rustic", "#", "#")),
    YEOMAN(new Data("Yeoman", "#", "#")),
    COMMANDER(new Data("Commander", "#", "#")),
    KNIGHT(new Data("Knight", "#", "#")),
    SERGEANT(new Data("Sergeant", "#", "#"), new Data("Lance Sergeant", "#", "#"), new Data("Studded Sergeant", "#", "#"), new Data("Color Sergeant", "#", "#")),
    SAILOR(new Data("Sailor", "#", "#"), new Data("Blue-Eyed Sailor", "#", "#"), new Data("Gray Sailor", "#", "#"), new Data("Chocolate Sailor", "#", "#")),
    CRACKER(new Data("Cracker", "#", "#"), new Data("Red Cracker", "#", "#"), new Data("Gray Cracker", "#", "#"), new Data("Pale Cracker", "#", "#")),
    LASCAR(new Data("Lascar", "#", "#")),
    VISCOUNT(new Data("Viscount", "#", "#")),
    BARON(new Data("Baron", "#", "#"), new Data("Malay Baron", "#", "#"), new Data("White-Tipped Baron", "#", "#"), new Data("Green Baron", "#", "#")),
    ARCHDUKE(new Data("Archduke", "#", "#")),
    MAPLET(new Data("Little Maplet", "#", "#")),
    COURTESAN(new Data("Courtesan", "#", "#")),
    NAWAB(new Data("Nawab", "#", "#"), new Data("Blue Nawab", "#", "#")),
    RAJAH(new Data("Rajah", "#", "#"), new Data("Black Rajah", "#", "#")),
    HARLEQUIN(new Data("Harlequin", "#", "#"), new Data("Lesser Harlequin", "#", "#")),
    APEFLY(new Data("Apefly", "#", "#")),
    SUNBEAM(new Data("Sunbeam", "#", "#"), new Data("Malayan Sunbeam", "#", "#")),
    DARKIE(new Data("Darkie", "#", "#")),
    BROWNIE(new Data("Brownie", "#", "#")),
    CUPID(new Data("Cupid", "#", "#"), new Data("Indian Cupid", "#", "#")),
    PIERROT(new Data("Peirrot", "#", "#"), new Data("Elbowed Pierrot", "#", "#")),
    QUAKER(new Data("Quaker", "#", "#")),
    FORGET_ME_NOT(new Data("Forget-Me-Not", "#", "#"), new Data("Silver Forget-Me-Not", "#", "#")),
    CAERULEAN(new Data("Caerulean", "#", "#"), new Data("Dark Caerulean", "#", "#"), new Data("Metallic Caerulean", "#", "#")),
    IMPERIAL(new Data("Imperial", "#", "#"), new Data("Branded Imperial", "#", "#"), new Data("Great Imperial", "#", "#"), new Data("Grand Imperial", "#", "#"), new Data("Green Imperial", "#", "#")),
    YAMFLY(new Data("Yamfly", "#", "#")),
    POSY(new Data("Posy", "#", "#"), new Data("Dark Posy", "#", "#")),
    ONYX(new Data("Onyx", "#", "#"), new Data("Ambon Onyx", "#", "#")),
    ROYAL(new Data("White Royal", "#", "#"), new Data("Royal Peacock", "#", "#"), new Data("Chocolate Royal", "#", "#"), new Data("Golden Royal", "#", "#"), new Data("Silver Royal", "#", "#")),
    CORNELIAN(new Data("Cornelian", "#", "#")),
    TIT(new Data("Tit", "#", "#"), new Data("Fluffy Tit", "#", "#")),
    SPARK(new Data("Spark", "#", "#")),
    PLANE(new Data("Plane", "#", "#")),
    FLASH(new Data("Flash", "#", "#"), new Data("Yellow Flash", "#", "#"), new Data("Copper Flash", "#", "#"), new Data("Scarlet Flash", "#", "#"), new Data("Red Flash", "#", "#"), new Data("Slate Flash", "#", "#"), new Data("Indigo Flash", "#", "#")),
    FLAT(new Data("Flat", "#", "#"), new Data("Pied Flat", "#", "#"), new Data("Snow Flat", "#", "#")),
    ANGLE(new Data("Chestnut Angle", "#", "#")),
    HOPPER(new Data("Bush", "#", "#")),
    BOB(new Data("Chestnut Bob", "#", "#"), new Data("Palm Bob", "#", "#")),
    COON(new Data("Coon", "#", "#")),
    DEMON(new Data("Grass Demon", "#", "#"), new Data("Banded Demon", "#", "#"), new Data("Chocolate Demon", "#", "#")),
    FLITTER(new Data("Flitter", "#", "#"), new Data("Tree Flitter", "#", "#")),
    LANCER(new Data("Lancer", "#", "#"), new Data("Chequered Lancer", "#", "#"), new Data("Vein Lancer", "#", "#"), new Data("Pugnaciou Lancer", "#", "#")),
    REDEYE(new Data("Redeye", "#", "#"), new Data("Giant Redeye", "#", "#"), new Data("Banded Redeye", "#", "#")),
    PALMER(new Data("Palmer", "#", "#"), new Data("Hoary Palmer", "#", "#")),
    BRUSHFOOT(new Data("Brushfoot", "#", "#")),
    SWIFT(new Data("Swift", "#", "#"), new Data("Great Swift", "#", "#"), new Data("Paintbrush Swift", "#", "#"));

    public static final ButterflyType[] types = values();
    private List<Data> dataValues = new ArrayList<Data>();

    ButterflyType(ButterflyEntity.Data... data) {
        for (Data d : data) {
            dataValues.add(d);
        }
    }

    public List<Data> getDataValues() {
        return dataValues;
    }
}