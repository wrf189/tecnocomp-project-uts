package haw.bmaajp.groceriesapp.utils

import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.domain.model.AboutItem
import haw.bmaajp.groceriesapp.domain.model.CategoryItem
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.ui.theme.*

object DataDummy {

    fun generateDummyProduct(): List<ProductItem> {
        return listOf(
            ProductItem(
                id = 1,
                title = "Gigabyte GeForce RTX 4060 8GB GDDR6",
                description = "Specifications, Chipset: GeForce RTX 4060, Core Clock: 2550 MHz (Reference card: 2460 MHz), CUDA Cores: 3072, Memory Clock: 17 Gbps, Memory Size: 8 GB, Memory Type: GDDR6, Memory Bus: 128 bit, Card Bus: PCI-E 4.0, Digital max resolution: 7680x4320, Multi-view: 4, Card size: L=281 W=114 H=40 mm, PCB Form: ATX, DirectX: 12 Ultimate",
                image = R.drawable.rtx4060,
                unit = "VGA Card",
                price = 375.0,
                nutritions = "Gigabyte",
                review = 4.8
            ),
            ProductItem(
                id = 2,
                title = "Intel® Core™ i9 Processor 13900K",
                description = "CPU Specifications:\n" +
                        "Total Cores : 24\n" +
                        "# of Performance-cores : 8\n" +
                        "# of Efficient-cores : 16\n" +
                        "Total Threads : 32\n" +
                        "Max Turbo Frequency : 5.80 GHz\n" +
                        "Intel® Thermal Velocity Boost Frequency : 5.80 GHz\n" +
                        "Intel® Turbo Boost Max Technology 3.0 Frequency : 5.70 GHz\n" +
                        "Performance-core Max Turbo Frequency : 5.40 GHz\n" +
                        "Efficient-core Max Turbo Frequency : 4.30 GHz\n" +
                        "Performance-core Base Frequency : 3.00 GHz\n" +
                        "Efficient-core Base Frequency : 2.20 GHz\n" +
                        "Cache : 36 MB Intel® Smart Cache\n" +
                        "Total L2 Cache : 32 MB\n" +
                        "Processor Base Power : 125 W\n" +
                        "Maximum Turbo Power : 253 W\n" +
                        "\n" +
                        "Memory Specifications :\n" +
                        "Max Memory Size (dependent on memory type) : 128 GB\n" +
                        "Memory Types :\n" +
                        "Up to DDR5 5600 MT/s\n" +
                        "Up to DDR4 3200 MT/s\n" +
                        "Max # of Memory Channels : 2\n" +
                        "Max Memory Bandwidth : 89.6 GB/s\n" +
                        "\n" +
                        "Processor Graphics\n" +
                        "Processor Graphics : Intel® UHD Graphics 770\n" +
                        "Graphics Base Frequency : 300 MHz\n" +
                        "Graphics Max Dynamic Frequency : 1.65 GHz\n" +
                        "Graphics Output : eDP 1.4b, DP 1.4a, HDMI 2.1\n" +
                        "Execution Units : 32\n" +
                        "Max Resolution (HDMI) : 4096 x 2160 @ 60Hz\n" +
                        "Max Resolution (DP)‡ :7680 x 4320 @ 60Hz\n" +
                        "Max Resolution (eDP - Integrated Flat Panel) :5120 x 3200 @ 120Hz\n" +
                        "DirectX* Support : 12\n" +
                        "OpenGL* Support : 4.5\n" +
                        "OpenCL* Support : 3.0\n" +
                        "Multi-Format Codec Engines : 2\n" +
                        "Intel® Quick Sync Video : Yes\n" +
                        "Intel® Clear Video HD Technology : Yes\n" +
                        "# of Displays Supported : 4\n" +
                        "Device : ID0xA780\n" +
                        "\n" +
                        "Expansion Options\n" +
                        "Direct Media Interface (DMI) Revision : 4.0\n" +
                        "Max # of DMI Lanes : 8\n" +
                        "Scalability : 1S Only\n" +
                        "PCI Express Revision : 5.0 and 4.0\n" +
                        "PCI Express Configurations : Up to 1x16+4, 2x8+4\n" +
                        "Max # of PCI Express Lanes : 20\n" +
                        "\n" +
                        "Package Specifications\n" +
                        "Sockets Supported : FCLGA1700\n" +
                        "Max CPU Configuration : 1\n" +
                        "TJUNCTION : 100°C",
                image = R.drawable.inteli9,
                unit = "CPU/Processor",
                price = 671.0,
                nutritions = "Intel",
                review = 4.5
            ),
            ProductItem(
                id = 3,
                title = "AMD Ryzen 9 7950X 4.5Ghz Up To 5.7Ghz",
                description = "AMD Ryzen 9 7950X 4.5Ghz Up To 5.7Ghz Cache 64MB AM5 [Box] - 16 Core\n" +
                        "Brand AMD\n" +
                        "Processors Type Desktop\n" +
                        "Series Ryzen 9 7000 Series\n" +
                        "Name Ryzen 9 7950X\n" +
                        "Model 100-100000514WOF\n" +
                        "DetailsCPU Socket Type Socket AM5\n" +
                        "# of Cores 16-Core\n" +
                        "# of Threads 32\n" +
                        "Operating Frequency 4.5 GHz\n" +
                        "Max Turbo Frequency Up to 5.7 GHz\n" +
                        "L1 Cache 1MB\n" +
                        "L2 Cache 16MB\n" +
                        "L3 Cache 64MB\n" +
                        "Manufacturing Tech 5nm",
                image = R.drawable.amdr9,
                unit = "CPU/Processor",
                price = 650.0,
                nutritions = "AMD",
                review = 4.1
            ),
            ProductItem(
                id = 4,
                title = "ASROCK B760M PRO RS DDR5",
                description = "Unique Feature:\n" +
                        "Superb Productivity\n" +
                        "- PCIe Gen5 (Graphics)\n" +
                        "- Dual Channel DDR5\n" +
                        "Rock-Solid Durability\n" +
                        "- 7+1+1 Power Phase, 50A Dr.MOS for VCore+GT\n" +
                        "- Pre-Installed I/O Shield\n" +
                        "Ultrafast Connectivity\n" +
                        "- 2.5G LAN EZ Update\n" +
                        "- ASRock Auto Driver Installer\n" +
                        "\n" +
                        "CPU\n" +
                        "- Supports 13th Gen & 12th Gen Intel® Core™ Processors (LGA1700)\n" +
                        "- Supports Intel® Hybrid Technology\n" +
                        "- Supports Intel® Turbo Boost Max 3.0 Technology\n" +
                        "- Supports Intel® Thermal Velocity Boost (TVB)\n" +
                        "- Supports Intel® Adaptive Boost Technology (ABT)\n" +
                        "\n" +
                        "Chipset\n" +
                        "- Intel® B760\n" +
                        "\n" +
                        "Memory\n" +
                        "- Dual Channel DDR5 Memory Technology\n" +
                        "- 4 x DDR5 DIMM Slots\n" +
                        "\n" +
                        "Audio\n" +
                        "- 7.1 CH HD Audio (Realtek ALC897 Audio Codec)\n" +
                        "- Nahimic Audio\n" +
                        "\n" +
                        "LAN\n" +
                        "- 2.5 Gigabit LAN 10/100/1000/2500 Mb/s\n" +
                        "- Dragon RTL8125BG\n" +
                        "- Supports Dragon 2.5G LAN Software\n" +
                        "\n" +
                        "Slots\n" +
                        "CPU:\n" +
                        "- 1 x PCIe 5.0 x16 Slot (PCIE1), supports x16 mode*\n" +
                        "Chipset:\n" +
                        "- 1 x PCIe 3.0 x16 Slot (PCIE2), supports x4 mode*\n" +
                        "- 1 x M.2 Socket\n" +
                        "\n" +
                        "Storage\n" +
                        "CPU:\n" +
                        "- 1 x Hyper M.2 Socket (M2_1, Key M), supports type 2242/2260/2280 PCIe Gen4x4 (64 Gb/s) mode*\n" +
                        "Chipset:\n" +
                        "- 1 x Hyper M.2 Socket (M2_2, Key M), supports type 2280 PCIe Gen4x4 (64 Gb/s) mode*\n" +
                        "- 1 x Hyper M.2 Socket (M2_3, Key M), supports type 2280 PCIe Gen4x4 (64 Gb/s) mode*\n" +
                        "- 4 x SATA3 6.0 Gb/s Connectors\n" +
                        "\n" +
                        "Accessories\n" +
                        "- 1 x User Manual\n" +
                        "- 2 x SATA Data Cables\n" +
                        "- 4 x Screws for M.2 Sockets\n" +
                        "- 1 x Standoff for M.2 Socket\n" +
                        "\n" +
                        "Form Factor\n" +
                        "- Micro ATX Form Factor: 9.6-in x 9.6-in, 24.4 cm x 24.4 cm",
                image = R.drawable.asrockb760m,
                unit = "Motherboard",
                price = 149.0,
                nutritions = "Asrock",
                review = 4.3
            ),
            ProductItem(
                id = 5,
                title = "Corsair CV Series 650W - 80 Plus Bronze",
                description = "Spesifikasi :\n" +
                        "Weight 1.9\n" +
                        "Adjustable Single/Multi 12V Rail No\n" +
                        "ATX Connector 1\n" +
                        "ATX12V Version v2.31\n" +
                        "Continuous output rated temperature C 30°C\n" +
                        "Continuous power W 650 Watts\n" +
                        "Fan bearing technology Sleeve Bearing\n" +
                        "Fan size mm 140mm\n" +
                        "MTBF hours 100,000 hours\n" +
                        "Multi-GPU ready No\n" +
                        "Warranty 3 Years\n" +
                        "80 PLUS Efficiency Bronze\n" +
                        "PSU Form Factor ATX\n" +
                        "iCUE Compatibility None\n" +
                        "Zero RPM Mode No\n" +
                        "\n" +
                        "Cable Type Sleeved and Flat Black Cables\n" +
                        "EPS12V Connector 1\n" +
                        "EPS12V Version v2.92\n" +
                        "Floppy Connector 1\n" +
                        "Modular No\n" +
                        "PCIe Connector 2\n" +
                        "SATA Connector 7\n" +
                        "\n" +
                        "Special Technology None\n" +
                        "Protections OVP (Over Voltage)\n" +
                        "UVP (Under Voltage)\n" +
                        "SCP (Short Circuit)\n" +
                        "OTP (Over Temp)\n" +
                        "OPP (Over Power)\n" +
                        "\n" +
                        "Garansi Resmi 3 Tahun",
                image = R.drawable.corsairv650,
                unit = "Power Supply",
                price = 61.5,
                nutritions = "Corsair",
                review = 4.8
            ),
            ProductItem(
                id = 6,
                title = "Kingston Fury Beast RGB DDR5 6000MHz 16GB (2x8GB)",
                description = "Spesifikasi:\n" +
                        "Kapasitas Total: 16GB (2x8GB)\n" +
                        "Profil Memori: 6000MT/s 40-40-40 1.35V\n" +
                        "Nomor Komponen: KF560C40BBAK2-16\n" +
                        "Kapasitas 16 GB\n" +
                        "Kecepatan* 5.600MT/dtk\n" +
                        "Latensi CL40\n" +
                        "Tegangan 1,35V\n" +
                        "Suhu Pengoperasian 0°C hingga 85°C\n" +
                        "Dimensi 133,35mm x 42,23mm x 7,11mm",
                image = R.drawable.kingstonram,
                unit = "RAM PC",
                price = 83.0,
                nutritions = "Kingston",
                review = 4.0
            ),
            ProductItem(
                id = 7,
                title = "Deepcool AK400 DIGITAL - Bracket LGA 1700",
                description = "Technical Spec\n" +
                        "Product Dimensions 126×97×156 mm\n" +
                        "Heatsink Dimensions 120×60×152 mm\n" +
                        "Net Weight 695 g\n" +
                        "Heatpipe Ø6 mm×4 pcs\n" +
                        "Fan Dimensions 120×120×25 mm\n" +
                        "Fan Speed 500~1850 RPM±10%\n" +
                        "Fan Airflow 68.99 CFM\n" +
                        "Fan Air Pressure 2.19 mmAq\n" +
                        "Fan Noise ≤28 dB(A)\n" +
                        "Fan Connector 4-pin PWM\n" +
                        "Bearing Type Fluid Dynamic Bearing\n" +
                        "Fan Rated Voltage 12 VDC\n" +
                        "Fan Rated Current 0.12 A\n" +
                        "Fan Power Consumption 1.44 W\n" +
                        "LED Type Addressable RGB LED\n" +
                        "LED Connector 3-pin(+5V-D-G) and 9-pin USB 2.0\n" +
                        "LED Rated Voltage 5 VDC\n" +
                        "LED Power Consumption 3 W\n" +
                        "EAN 6933412728207\n" +
                        "P/N R-AK400-BKADMN-G",
                image = R.drawable.cpucooler,
                unit = "CPU Cooler",
                price = 37.0,
                nutritions = "Deepcool",
                review = 3.7
            ),
            ProductItem(
                id = 8,
                title = "Digital Alliance N30S White - Miro ATX Tempered Glass",
                description = "Model : N30S\n" +
                        "Case Type : Middle Tower\n" +
                        "Color : Black / White\n" +
                        "Dimension (LxWxH) : 385 x 275 x 365 mm\n" +
                        "Net Weight : 8.6kg\n" +
                        "Gross Weight : 9.6kg\n" +
                        "Front Side : Tempered glass\n" +
                        "Right Side : Tempered glass\n" +
                        "Left Side : Plate\n" +
                        "Color : Black\n" +
                        "Material : Steel Plate + ABS + Tempered Glass\n" +
                        "PCI Slot : 5+2\n" +
                        "Drive Bays : 3.5”x2 or 2.5”x1, 3.5”x1\n" +
                        "Motherboards : M-ATX, ITX\n" +
                        "I/O Ports : USB 2.0, USB 3.0, Audio, Microphone\n" +
                        "Max VGA CARD : 370mm\n" +
                        "Max CPU COOLER : 160mm\n" +
                        "\n" +
                        "Fan Support\n" +
                        "Top : 3 x 12 cm\n" +
                        "Rear : 1 x 12 cm or 1 x 14 cm\n" +
                        "Bottom : 3 x 12 cm\n" +
                        "Clapboard : 2 x 12 cm\n" +
                        "\n" +
                        "Cable Management Support: Yes\n" +
                        "\n" +
                        "Main Featured :\n" +
                        "\n" +
                        "• Front Tempered Glass\n" +
                        "• Support 370mm GPU & CPU Cooler height 190mm\n" +
                        "• PSU Cover\n" +
                        "• Support up to 9 Fans\n" +
                        "• Top magnetic filter dust",
                image = R.drawable.caseda,
                unit = "PC Case",
                price = 31.9,
                nutritions = "Digital Alliance",
                review = 3.9
            ),
            ProductItem(
                id = 9,
                title = "SSD WD Blue 3D NAND 500GB SATA III 3D 6Gb/s",
                description = "SSD with 3D NAND TECHNOLOGY\n" +
                        "\n" +
                        "APPLICATION : Client PCs\n" +
                        "FORM FACTOR : 2.5 inch\n" +
                        "INTERFACE : SATA 6Gb/s (compatible with SATA 3Gb/s & SATA 1.5Gb/s)\n" +
                        "DIMENSION (WxHxD) : 100 X 69.85 X 7 (mm)\n" +
                        "Thickness : 7mm, suitable to replace Laptop HDD\n" +
                        "MTTF : up to 1.75Million hours\n" +
                        "\n" +
                        "STORAGE MEMORY : WD 3D NAND TLC 64 layer\n" +
                        "Controller : Marvell\n" +
                        "\n" +
                        "Sequential Read : up to 550MB/s\n" +
                        "Sequential Write : up to 525MB/s\n" +
                        "Random Read : up to 95.000 IOPS\n" +
                        "Random Write : up to 81.000 IOPS\n" +
                        "Average Active Power : 52mW (miliWatt, very low power)",
                image = R.drawable.ssd500,
                unit = "Storage",
                price = 38.7,
                nutritions = "WD",
                review = 4.2
            ),
            ProductItem(
                id = 10,
                title = "SSD Team MP33 PRO M.2 2280 NVME 512GB - PCIe Gen 3x4",
                description = "Product Specifications:\n" +
                        "Model MP33 PRO M.2 PCIe SSD\n" +
                        "Interface PCIe 3.0 x4 with NVMe 1.3\n" +
                        "Voltage DC +3.3V\n" +
                        "Operation Temperature 0˚C ~ 70˚C\n" +
                        "Storage Temperature -40˚C ~ 85˚C\n" +
                        "\n" +
                        "Terabyte Written\n" +
                        "512GB / >400TB\n" +
                        "1TB / >600TB\n" +
                        "2TB / >1,000TB\n" +
                        "\n" +
                        "Performance\n" +
                        "Crystal Disk Mark: Read/Write: up to 2,100/1,700 MB/s\n" +
                        "IOPS: Read/Write: 220K/200K IOPS Max\n" +
                        "Weight 6g\n" +
                        "Dimensions 80(L) x 22(W) x 3.8(H) mm\n" +
                        "Humidity RH 90% under 40°C (operational)\n" +
                        "Vibration 80Hz~2,000Hz/20G\n" +
                        "Shock 1,500G/0.5ms\n" +
                        "MTBF 2,000,000 hours\n" +
                        "Operating System System Requirements:\n" +
                        "Windows 10, Windows 8.1, Windows 8, Windows 7, Windows Vista\n" +
                        "Linux 2.6.33 or later\n" +
                        "Warranty 5-year limited warranty",
                image = R.drawable.ssdtm,
                unit = "Storage",
                price = 34.2,
                nutritions = "TEAMGROUP",
                review = 4.3
            ),
        )
    }

    fun generateDummyCategories(): List<CategoryItem> {
        return listOf(
            CategoryItem(
                title = "Accessories",
                image = R.drawable.category1,
                background = BackgroundCategory1
            ),
            CategoryItem(
                title = "VGA Card",
                image = R.drawable.category2,
                background = BackgroundCategory2
            ),
            CategoryItem(
                title = "CPU/Processor",
                image = R.drawable.category3,
                background = BackgroundCategory3
            ),
            CategoryItem(
                title = "Motherboard",
                image = R.drawable.category4,
                background = BackgroundCategory4
            ),
            CategoryItem(
                title = "Power Supply",
                image = R.drawable.category5,
                background = BackgroundCategory5
            ),
            CategoryItem(
                title = "Storage &" + "\nRAM PC",
                image = R.drawable.category6,
                background = BackgroundCategory6
            )
        )
    }

    fun generateDummyAbout(): List<AboutItem> {
        return listOf(
            AboutItem(
                image = R.drawable.baseline_android_24,
                title = "About Us"
            ),
            AboutItem(
                image = R.drawable.baseline_groups_24,
                title = "Kelompok 4 BM5B",
            ),
            AboutItem(
                image = R.drawable.asrul,
                title = "Asrul Hafidz R 2103421020"
            ),
            AboutItem(
                image = R.drawable.rofi,
                title = "Jilaan Rofi Arkaan 2103421036"
            ),
            AboutItem(
                image = R.drawable.wangsa,
                title = "Wangsa Reisyah F 2103421005"
            ),
        )
    }

}